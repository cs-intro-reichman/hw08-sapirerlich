public class main_test {
    public static void main(String[] args) {

        PlayList playList = new PlayList(5);
        playList.add(new Track("Creep", "Radiohead", 369));
        playList.add(new Track("Yesterday", "The Beatles", 125)); // This is the shortest
        playList.add(new Track("Fernando", "ABBA", 354));
    
        String shortestTrack = playList.titleOfShortestTrack();
    
        if ("Yesterday".equals(shortestTrack)) {
            System.out.println("testTitleOfShortestTrack: PASS");
        } else {
            System.out.println("testTitleOfShortestTrack: FAIL. Expected 'Yesterday', got " + shortestTrack);
        }
    }
}
