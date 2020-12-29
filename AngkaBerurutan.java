class AngkaBerurutan {
   public static void main(String[] args) {
       int[] data = {4,2,3,3,2,4,6,7,3,9};
       
        System.out.println(ujian(data));

    }

    public static int ujian(int[] data) {

        int angka =1, max =1;
        for (int a = 1; a < data.length; a++) {
            if (data[a] > data[a - 1]) {
                angka++;
            } else {
                angka = 1;
            }
            if (angka >= max) {
                max = angka;
            }
        }
        return max;
    }
}