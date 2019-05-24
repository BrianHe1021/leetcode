class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(list, "", 0, n);
        return list;
    }

    private void helper(List<String> list, String str, int rightNeed, int leftRest) {
        if (rightNeed == 0 && leftRest == 0) {
            list.add(str);
            return;
        }
        if (rightNeed > 0) helper(list, str + ")", rightNeed - 1, leftRest);
        if (leftRest > 0) helper(list, str + "(", rightNeed + 1, leftRest - 1);
    }
}