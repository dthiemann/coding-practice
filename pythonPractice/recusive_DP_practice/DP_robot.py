
def robotTraversal(num_rows, num_columns):
    my_map = []
    for i in range(num_columns):
        my_map.append([])
        for j in range(num_rows):
            my_map[i].append(-1)

    robotTraversalHelper(0, 0, my_map)

    return my_map[num_columns-1][num_rows-1]



def robotTraversalHelper(x,y, map):
    if x == len(map[0]) and y == len(map):
        pass
    return