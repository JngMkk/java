class Array2 {
    public static void main(String[] args) {
        String[] sr = new String[7];
        sr[0] = "Java";
        sr[1] = "System";
        sr[2] = "Compiler";
        sr[3] = "Park";
        sr[4] = "Tree";
        sr[5] = "Dinner";
        sr[6] = "Brunch Cafe";

        int cnt = 0;
        for (int i = 0; i < sr.length; i++) {
            cnt += sr[i].length();
        }
        System.out.println(cnt);
    }
}
