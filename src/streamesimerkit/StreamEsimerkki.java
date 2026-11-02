public class StreamEsimerkki {
    public static void main(String[] args) {
        int[] luvut = { 1, 2, 4, 56, 6, 3, 2, 2, 4, 5, 3, 2, 23, 66, 35, 23, 200, 100 };

        //Terminaali operaattori SUm laskee kaikki alkiot yhteen
        //Terminaalioperaattori tarkoittaa sitä, että se voi olla vain komentoketjun viimeisenä
        int summa = Arrays.stream(luvut).sum;
        System.out.println("Summa: " + summa);
    }

}
