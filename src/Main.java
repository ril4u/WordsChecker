public class Main {
    public static void main(String[] args) {
        WordsChecker txt = new WordsChecker("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Volutpat commodo sed egestas egestas. Vitae ultricies leo integer malesuada nunc vel. Nec tincidunt praesent semper feugiat nibh sed pulvinar proin. Viverra aliquet eget sit amet. Mus mauris vitae ultricies leo integer malesuada nunc vel. Elementum nibh tellus molestie nunc non blandit massa. Tincidunt id aliquet risus feugiat in. Lobortis mattis aliquam faucibus purus in massa tempor nec. Nulla facilisi etiam dignissim diam quis enim lobortis scelerisque. Bibendum ut tristique et egestas quis. Consectetur purus ut faucibus pulvinar elementum integer enim. Adipiscing diam donec adipiscing tristique risus nec. Et tortor at risus viverra. Augue ut lectus arcu bibendum at varius vel pharetra. Velit euismod in pellentesque massa. Commodo ullamcorper a lacus vestibulum sed arcu non. Felis eget nunc lobortis mattis aliquam faucibus purus in massa.\n" +
                "\n" +
                "Sed cras ornare arcu dui vivamus arcu felis. Amet porttitor eget dolor morbi non. Eu volutpat odio facilisis mauris sit amet massa vitae. Nulla facilisi nullam vehicula ipsum a arcu. Parturient montes nascetur ridiculus mus mauris vitae ultricies. Arcu dui vivamus arcu felis bibendum ut tristique. Vel pharetra vel turpis nunc eget lorem dolor. Et ultrices neque ornare aenean euismod elementum. Pulvinar proin gravida hendrerit lectus a. Ut ornare lectus sit amet est placerat. Bibendum est ultricies integer quis auctor elit. Sed turpis tincidunt id aliquet. Blandit volutpat maecenas volutpat blandit. Tristique risus nec feugiat in fermentum.\n" +
                "\n" +
                "Suspendisse ultrices gravida dictum fusce ut placerat orci. Sem nulla pharetra diam sit amet nisl suscipit. Integer feugiat scelerisque varius morbi enim. Nibh praesent tristique magna sit amet purus gravida quis. Sagittis nisl rhoncus mattis rhoncus urna neque viverra. Tincidunt eget nullam non nisi est sit amet facilisis magna. Sem et tortor consequat id porta nibh venenatis cras sed. Morbi leo urna molestie at elementum. Mattis rhoncus urna neque viverra justo nec ultrices. Hendrerit dolor magna eget est lorem ipsum. Mi ipsum faucibus vitae aliquet. Non sodales neque sodales ut etiam sit amet nisl purus. Nisl rhoncus mattis rhoncus urna neque viverra.");

        //слово в начале
        System.out.println(txt.hasWord("Lorem"));
        //слово в середине
        System.out.println(txt.hasWord("felis"));
        //неправильное слово
        System.out.println(txt.hasWord("grovida"));
        //слово в конце
        System.out.println(txt.hasWord("nisl"));

    }
}