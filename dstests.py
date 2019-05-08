#importando las Librerías
import numpy as np
import matplotlib.pyplot as plt
import pandas as pd
from sklearn.cluster import KMeans

arr = [[1, 4, 7, 2, 6, 2, 8, 2,9,2,2],[6, 2, 9, 1, 9, 3, 7, 4, 8, 2, 5]]

f1 = arr[0]
f2 = arr[1]
X = np.array(list(zip(f1, f2)))
kmeans = KMeans(n_clusters=3)
kmeans = kmeans.fit(X)
labels = kmeans.predict(X)
centroids = kmeans.cluster_centers_
print(centroids)