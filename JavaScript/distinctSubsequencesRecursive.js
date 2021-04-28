// Given two strings s and t, return the number of distinct subsequences of s which equals t.

/**
 * @param {string} s Source string.
 * @param {string} t Target string.
 * @return {number} Total distinct occurences of t in s.
 */
function numDistinct(s, t) {
  /**
   * Counts distinct occurences of t in s. 
   * @param {number} source Source string index.
   * @param {number} target Target string index.
   * @return {number} Total distinct occurences.
   */
  function countDistinct(source, target) {
    // Base Cases
    if (target < 0) { return 1 } // Empty string is a subsequence to all.
    if (source < 0) { return 0 } // Empty string cannot have a subsequence.
      
    // Recursive Cases
    if (s.charAt(source) != t.charAt(target)) { // Chars at source and target do not match.
      // Check the same target against a decremented source.
      return countDistinct(source - 1, target)

    } else { // Chars at source and target match.
      // Char at target is either A. part of a subsequence or B. not part of a subsequence.
      // Return the sum of both options.
      return countDistinct(source - 1, target - 1) 
            + countDistinct(source - 1, target)
    }
  }

  return countDistinct(s.length - 1, t.length - 1)
}
