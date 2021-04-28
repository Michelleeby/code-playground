# Given an array of unique integers, return all unique subsets.

# @param {Integer[]} set An array of unique integers.
# @return {Integer[][]} All subsets of set.
def subsets(set)
    # Initialize accumulator, acc, with empty set.
    acc = [ [] ]
    # Push remaining combinations into acc
    set.each_index{ |i| set.combination(i + 1){ |combo| acc.push(combo) } }
    
    return acc
end
