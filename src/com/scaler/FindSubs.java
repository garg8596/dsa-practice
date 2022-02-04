package com.scaler;

public class FindSubs {
    public String solve(String A, String B) {
        int len = A.length();

        if(A.length() > B.length()) return "NO";

        int index = B.indexOf(A.charAt(0));
        for(int i=1; i<len-1; i++)
        {
            int i1 = B.indexOf(A.charAt(i), index);
            int i2 = B.indexOf(A.charAt(i + 1), i1);
            System.out.println("i1: " + i1 + " i2: " + i2);
            if(i1 > i2) return "NO";
            index = i2;
        }
        return "YES";
    }

    public static void main(String[] args) {
        String A = "yzzpedaludatwhxaxmxpcvmdssbyfntqefxodazpevcovzbtljochsahjluqjhfbejegftntgwjxkixabfowxznkgecvxfcooftuguiueqblalzyvotbliaddzommnlqhzmpijblavmraijbofdfwxdrnnynaptjnjdwsgatrekjmdkrrombiiclecaqxzgizqjmtxjfgniafccapkfiektczhidurqieagsbbngfgfhohhlkehnfhtvbcypivqcmjfgtcnelnubhguiquclwbvbysfsgrexmnwtkabetycbwzjwlikkfmpbdzilxzcwxynsmdzzrpmavrznfitgsynsfugrpqfapuxgyblousftvwyewmkmpdlcydrkmyhqbtgohkfcpsacchscgzvaeriuqfb";
        String B = "axtoveymxlaoqiykgsxuqdzcltxnzfkpohhzzshgyhmddoordyiedlaecbqycetrxisjhivtbuwevwnnmfkwcjnsajytstohnxmwgkfopukbzmvszbcbguiwaceiqyvqqrjuvjhotrkoqictbqthxomcgeyjzqmipmedhorgqqagftgjfxrgwaktftidrmlacsdbbtodfsocvqnyrafzohifnuuddsxouykbejjcbmcoziuyifvjwbzgvkjxlajkefumevqexzecgbnzusvsrfhevidlwjjptmluufunkleaqfnkeuzsirnoyyjsotinccvtbznzbqphaupqeivduunfrimanuqidrwquqpoanzdosbxpylpnvnzlsydzobfvzrfmpypuvvqhttfqozioczepivedappormektyaswkfdpnowocwdgbetennpoogemjclnvzjtrvnwvmodwxlqlaeysbipyaakvhibvxmddcmawmchxxmohkrcakbusnkymnsxwvmuueykfhdqfsvtgozelqmoqnobendqvjwktmqdujwhaxheipgagwxpjtuxjqyjktmwgkwouwkdgpwpdiuspshbswtfxemankfmygpdzbqotodiztdokudalefmppommmsslephnsvokkewcwphlxnwslhaatx";

        System.out.println(new FindSubs().solve(A, B));
    }
}
