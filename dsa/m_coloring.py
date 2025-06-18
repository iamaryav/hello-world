def is_safe(node, graph, colors, color):
    for neighbor in graph[node]:
        if colors[neighbor] == color:
            return False
    return True

def graph_coloring(graph, m, colors, node=0):
    if node == len(graph):
        return True

    for color in range(1, m+1):
        if is_safe(node, graph, colors, color):
            colors[node] = color
            if graph_coloring(graph, m, colors, node+1):
                return True
            colors[node] = 0  # backtrack
    return False

# Example usage
# Graph: 0-1, 1-2, 0-2 (Triangle)
graph = {
    0: [1, 2],
    1: [0, 2],
    2: [0, 1]
}
m = 3  # max number of colors allowed
colors = [0] * len(graph)

if graph_coloring(graph, m, colors):
    print("Coloring possible:", colors)
else:
    print("Not possible with", m, "colors")
