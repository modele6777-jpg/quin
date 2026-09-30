package defpackage;

import android.text.TextUtils;
import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qv8 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        h71 h71VarE;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "application/vnd.dvb.ait":
            case "application/x-icy":
            case "application/x-camera-motion":
            case "application/id3":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "application/meta":
            case "audio/ac3":
            case "audio/raw":
            case "application/x-media3-cues":
            case "application/x-itut-t35":
            case "application/x-emsg":
            case "video/apv":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "application/x-scte35":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (h71VarE = e(str2)) == null || (iA = h71VarE.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static int b(String str, String str2) {
        h71 h71VarE;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (h71VarE = e(str2)) == null) {
                    return 0;
                }
                return h71VarE.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/dsd":
                return 31;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        h71 h71VarE;
        String strD = null;
        if (str != null) {
            String strV = bm8.V(str.trim());
            if (strV.startsWith("avc1") || strV.startsWith("avc3")) {
                return "video/avc";
            }
            if (strV.startsWith("hev1") || strV.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strV.startsWith("vvc1") || strV.startsWith("vvi1")) {
                return "video/vvc";
            }
            if (strV.startsWith("dvav") || strV.startsWith("dva1") || strV.startsWith("dvhe") || strV.startsWith("dvh1") || strV.startsWith("dav1")) {
                return "video/dolby-vision";
            }
            if (strV.startsWith("av01")) {
                return "video/av01";
            }
            if (strV.startsWith("vp9") || strV.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strV.startsWith("vp8") || strV.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strV.startsWith("mp4a")) {
                if (strV.startsWith("mp4a.") && (h71VarE = e(strV)) != null) {
                    strD = d(h71VarE.b);
                }
                return strD == null ? "audio/mp4a-latm" : strD;
            }
            if (strV.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strV.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strV.startsWith("ac-3") || strV.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strV.startsWith("ec-3") || strV.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strV.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strV.startsWith("ac-4") || strV.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strV.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strV.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strV.startsWith("dtsh") || strV.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strV.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strV.startsWith("opus")) {
                return "audio/opus";
            }
            if (strV.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strV.startsWith("flac")) {
                return "audio/flac";
            }
            if (strV.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strV.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strV.contains("cea708")) {
                return "application/cea-708";
            }
            if (strV.contains("eia608") || strV.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                r3.f();
                return null;
            }
        }
        return null;
    }

    public static String d(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static h71 e(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new h71(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0, 3);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String f(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (k(str)) {
            return 2;
        }
        if (j(str)) {
            return 3;
        }
        if (i(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        r3.f();
        return 0;
    }

    public static boolean h(String str) {
        return "audio".equals(f(str));
    }

    public static boolean i(String str) {
        return "image".equals(f(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean j(String str) {
        return "text".equals(f(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean k(String str) {
        return "video".equals(f(str));
    }

    public static String l(String str) {
        if (str == null) {
            return null;
        }
        String strV = bm8.V(str);
        strV.getClass();
        switch (strV) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strV;
        }
    }
}
