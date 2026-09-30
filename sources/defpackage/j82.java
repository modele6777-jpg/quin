package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j82 {
    public static final Pattern a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
    public static final HashMap d;

    static {
        HashMap map = new HashMap();
        d = map;
        ks0.r(-984833, map, "aliceblue", -332841, "antiquewhite");
        ks0.x(map, "aqua", -16711681, -8388652, "aquamarine");
        ks0.r(-983041, map, "azure", -657956, "beige");
        ks0.r(-6972, map, "bisque", -16777216, "black");
        ks0.r(-5171, map, "blanchedalmond", -16776961, "blue");
        ks0.r(-7722014, map, "blueviolet", -5952982, "brown");
        ks0.r(-2180985, map, "burlywood", -10510688, "cadetblue");
        ks0.r(-8388864, map, "chartreuse", -2987746, "chocolate");
        ks0.r(-32944, map, "coral", -10185235, "cornflowerblue");
        ks0.r(-1828, map, "cornsilk", -2354116, "crimson");
        ks0.x(map, "cyan", -16711681, -16777077, "darkblue");
        ks0.r(-16741493, map, "darkcyan", -4684277, "darkgoldenrod");
        ks0.x(map, "darkgray", -5658199, -16751616, "darkgreen");
        ks0.x(map, "darkgrey", -5658199, -4343957, "darkkhaki");
        ks0.r(-7667573, map, "darkmagenta", -11179217, "darkolivegreen");
        ks0.r(-29696, map, "darkorange", -6737204, "darkorchid");
        ks0.r(-7667712, map, "darkred", -1468806, "darksalmon");
        ks0.r(-7357297, map, "darkseagreen", -12042869, "darkslateblue");
        map.put("darkslategray", -13676721);
        map.put("darkslategrey", -13676721);
        ks0.x(map, "darkturquoise", -16724271, -7077677, "darkviolet");
        ks0.r(-60269, map, "deeppink", -16728065, "deepskyblue");
        map.put("dimgray", -9868951);
        map.put("dimgrey", -9868951);
        ks0.x(map, "dodgerblue", -14774017, -5103070, "firebrick");
        ks0.r(-1296, map, "floralwhite", -14513374, "forestgreen");
        ks0.x(map, "fuchsia", -65281, -2302756, "gainsboro");
        ks0.r(-460545, map, "ghostwhite", -10496, "gold");
        map.put("goldenrod", -2448096);
        map.put("gray", -8355712);
        ks0.r(-16744448, map, "green", -5374161, "greenyellow");
        ks0.x(map, "grey", -8355712, -983056, "honeydew");
        ks0.r(-38476, map, "hotpink", -3318692, "indianred");
        ks0.r(-11861886, map, "indigo", -16, "ivory");
        ks0.r(-989556, map, "khaki", -1644806, "lavender");
        ks0.r(-3851, map, "lavenderblush", -8586240, "lawngreen");
        ks0.r(-1331, map, "lemonchiffon", -5383962, "lightblue");
        ks0.r(-1015680, map, "lightcoral", -2031617, "lightcyan");
        map.put("lightgoldenrodyellow", -329006);
        map.put("lightgray", -2894893);
        map.put("lightgreen", -7278960);
        map.put("lightgrey", -2894893);
        ks0.r(-18751, map, "lightpink", -24454, "lightsalmon");
        ks0.r(-14634326, map, "lightseagreen", -7876870, "lightskyblue");
        map.put("lightslategray", -8943463);
        map.put("lightslategrey", -8943463);
        ks0.x(map, "lightsteelblue", -5192482, -32, "lightyellow");
        ks0.r(-16711936, map, "lime", -13447886, "limegreen");
        map.put("linen", -331546);
        map.put("magenta", -65281);
        ks0.r(-8388608, map, "maroon", -10039894, "mediumaquamarine");
        ks0.r(-16777011, map, "mediumblue", -4565549, "mediumorchid");
        ks0.r(-7114533, map, "mediumpurple", -12799119, "mediumseagreen");
        ks0.r(-8689426, map, "mediumslateblue", -16713062, "mediumspringgreen");
        ks0.r(-12004916, map, "mediumturquoise", -3730043, "mediumvioletred");
        ks0.r(-15132304, map, "midnightblue", -655366, "mintcream");
        ks0.r(-6943, map, "mistyrose", -6987, "moccasin");
        ks0.r(-8531, map, "navajowhite", -16777088, "navy");
        ks0.r(-133658, map, "oldlace", -8355840, "olive");
        ks0.r(-9728477, map, "olivedrab", -23296, "orange");
        ks0.r(-47872, map, "orangered", -2461482, "orchid");
        ks0.r(-1120086, map, "palegoldenrod", -6751336, "palegreen");
        ks0.r(-5247250, map, "paleturquoise", -2396013, "palevioletred");
        ks0.r(-4139, map, "papayawhip", -9543, "peachpuff");
        ks0.r(-3308225, map, "peru", -16181, "pink");
        ks0.r(-2252579, map, "plum", -5185306, "powderblue");
        ks0.r(-8388480, map, "purple", -10079335, "rebeccapurple");
        ks0.r(-65536, map, "red", -4419697, "rosybrown");
        ks0.r(-12490271, map, "royalblue", -7650029, "saddlebrown");
        ks0.r(-360334, map, "salmon", -744352, "sandybrown");
        ks0.r(-13726889, map, "seagreen", -2578, "seashell");
        ks0.r(-6270419, map, "sienna", -4144960, "silver");
        ks0.r(-7876885, map, "skyblue", -9807155, "slateblue");
        map.put("slategray", -9404272);
        map.put("slategrey", -9404272);
        ks0.x(map, "snow", -1286, -16711809, "springgreen");
        ks0.r(-12156236, map, "steelblue", -2968436, "tan");
        ks0.r(-16744320, map, "teal", -2572328, "thistle");
        ks0.r(-40121, map, "tomato", 0, "transparent");
        ks0.r(-12525360, map, "turquoise", -1146130, "violet");
        ks0.r(-663885, map, "wheat", -1, "white");
        ks0.r(-657931, map, "whitesmoke", -256, "yellow");
        map.put("yellowgreen", -6632142);
    }

    public static int a(String str, boolean z) {
        int i;
        pa7.A(!TextUtils.isEmpty(str));
        String strReplace = str.replace(" ", "");
        if (strReplace.charAt(0) == '#') {
            int i2 = (int) Long.parseLong(strReplace.substring(1), 16);
            if (strReplace.length() == 7) {
                return (-16777216) | i2;
            }
            if (strReplace.length() == 9) {
                return ((i2 & 255) << 24) | (i2 >>> 8);
            }
            cva.s();
            return 0;
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? c : b).matcher(strReplace);
            if (matcher.matches()) {
                if (z) {
                    String strGroup = matcher.group(4);
                    strGroup.getClass();
                    i = (int) (Float.parseFloat(strGroup) * 255.0f);
                } else {
                    String strGroup2 = matcher.group(4);
                    strGroup2.getClass();
                    i = Integer.parseInt(strGroup2, 10);
                }
                String strGroup3 = matcher.group(1);
                strGroup3.getClass();
                int i3 = Integer.parseInt(strGroup3, 10);
                String strGroup4 = matcher.group(2);
                strGroup4.getClass();
                int i4 = Integer.parseInt(strGroup4, 10);
                String strGroup5 = matcher.group(3);
                strGroup5.getClass();
                return Color.argb(i, i3, i4, Integer.parseInt(strGroup5, 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = a.matcher(strReplace);
            if (matcher2.matches()) {
                String strGroup6 = matcher2.group(1);
                strGroup6.getClass();
                int i5 = Integer.parseInt(strGroup6, 10);
                String strGroup7 = matcher2.group(2);
                strGroup7.getClass();
                int i6 = Integer.parseInt(strGroup7, 10);
                String strGroup8 = matcher2.group(3);
                strGroup8.getClass();
                return Color.rgb(i5, i6, Integer.parseInt(strGroup8, 10));
            }
        } else {
            Integer num = (Integer) d.get(bm8.V(strReplace));
            if (num != null) {
                return num.intValue();
            }
        }
        cva.s();
        return 0;
    }
}
