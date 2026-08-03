class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        // Hashmap to store player loss count
        HashMap<Integer,Integer> loss = new HashMap<>();
        // Store all unique players
        HashSet<Integer> players = new HashSet<>();
        // traverse match and add winning and loser
        for(int[] match: matches){
            int winner = match[0];
            int loser = match[1];
            // adding players to hashSet ---- store all unique players
            players.add(loser);
            players.add(winner);
            //increasing loser count
            loss.put(loser,loss.getOrDefault(loser,0)+1);   
        }
        ArrayList<Integer> zeroLoss = new ArrayList<>();
        ArrayList<Integer> oneLoss = new ArrayList<>();
        
        // traverse hashset every player and find loss count
        for(int player: players){
            int lossCount = loss.getOrDefault(player,0);
            if(lossCount==0) zeroLoss.add(player);
            if(lossCount==1) oneLoss.add(player);
        }
    // sorting zero loss and one loss
    Collections.sort(zeroLoss);
    Collections.sort(oneLoss);
    // prepare list answer;
      List<List<Integer>> ans = new ArrayList<>();
      ans.add(zeroLoss);
      ans.add(oneLoss);
      return ans;
    }
}