public class Stringbuilder {
    public static void main(String[] args) {
        String str = "Aki";
        StringBuilder sb = new StringBuilder("Aki");
        StringBuilder sbuild = new StringBuilder("Akif");
        StringBuilder sb2 = new StringBuilder(" und ");
        StringBuilder sb3 = new StringBuilder("Onur");
        sb.append(sb2);
        sb.append(sb3);
        System.out.println("Stringbuilder und Strings auf Inhaltsgleichheit prüfen: ");
        System.out.println(str.equals(sbuild.toString()));
        System.out.println(str.contentEquals(sbuild));
        System.out.println("Appended sb: ");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.deleteCharAt(6));
        System.out.println(sb);
        System.out.println(sb.length());
        sb.setCharAt(6,'n');
        System.out.println(sb);
    }
}
