package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vd8 {
    public static final Locale[] a = {Locale.ENGLISH, Locale.TRADITIONAL_CHINESE, Locale.CHINESE, Locale.JAPANESE, Locale.KOREAN, Locale.forLanguageTag("es-ES")};
    public static final Locale b = cn1.z().getResources().getConfiguration().getLocales().get(0);

    public static String a() {
        String strC = c(b());
        strC.getClass();
        return strC;
    }

    public static Locale b() {
        Object dzbVar;
        Locale localeB = i80.b().b(0);
        if (localeB != null) {
            return localeB;
        }
        try {
            Context contextZ = cn1.z();
            dzbVar = td8.b;
            if (Build.VERSION.SDK_INT >= 33) {
                Object systemService = contextZ.getSystemService("locale");
                if (systemService != null) {
                    dzbVar = td8.c(q6.C(systemService));
                }
            } else {
                dzbVar = td8.a(Resources.getSystem().getConfiguration().getLocales().toLanguageTags());
            }
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        Locale locale = b;
        if (thA != null) {
            dzbVar = td8.c(new LocaleList(locale));
        }
        dzbVar.getClass();
        td8 td8Var = (td8) dzbVar;
        Locale firstMatch = td8Var.a.a.getFirstMatch(new String[]{"zh-HK", "zh-TW", "zh-MO", "zh-CN"});
        if (pa7.t(firstMatch, Locale.forLanguageTag("zh-HK")) || pa7.t(firstMatch, Locale.forLanguageTag("zh-TW")) || pa7.t(firstMatch, Locale.forLanguageTag("zh-MO"))) {
            locale = Locale.TRADITIONAL_CHINESE;
        } else if (pa7.t(firstMatch, Locale.forLanguageTag("zh-CN"))) {
            locale = Locale.CHINESE;
        } else {
            Locale localeB2 = td8Var.b(0);
            if (localeB2 != null) {
                locale = localeB2;
            }
        }
        locale.getClass();
        return locale;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004a A[ORIG_RETURN, RETURN] */
    public static String c(Locale locale) {
        locale.getClass();
        String languageTag = locale.toLanguageTag();
        if (languageTag == null) {
            return languageTag;
        }
        switch (languageTag.hashCode()) {
            case -372468771:
                if (languageTag.equals("zh-Hans")) {
                    return "zh-CN";
                }
                return languageTag;
            case -372468770:
                return !languageTag.equals("zh-Hant") ? languageTag : "zh-TW";
            case 1978381403:
                if (languageTag.equals("zh-Hans-CN")) {
                    return "zh-CN";
                }
                return languageTag;
            case 1978411346:
                return languageTag.equals("zh-Hant-HK") ? "zh-TW" : languageTag;
            case 1978411505:
                return !languageTag.equals("zh-Hant-MO") ? languageTag : "zh-TW";
            case 1978411730:
                return !languageTag.equals("zh-Hant-TW") ? languageTag : "zh-TW";
            default:
                return languageTag;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x007b A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r0.equals("ko-KR") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r0.equals("ja-JP") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r0.equals("ko") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        return "ko";
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        if (r0.equals("ja") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        return "ja";
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d() {
        /*
            java.util.Locale r0 = b()
            java.lang.String r0 = c(r0)
            r0.getClass()
            int r1 = r0.hashCode()
            java.lang.String r2 = "ja"
            java.lang.String r3 = "ko"
            java.lang.String r4 = "es"
            switch(r1) {
                case -326827913: goto L69;
                case 3246: goto L62;
                case 3383: goto L5a;
                case 3428: goto L52;
                case 3886: goto L46;
                case 100828572: goto L3d;
                case 102169200: goto L34;
                case 115813226: goto L2b;
                case 115813762: goto L22;
                case 1978381403: goto L19;
                default: goto L18;
            }
        L18:
            goto L71
        L19:
            java.lang.String r1 = "zh-Hans-CN"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4f
            goto L71
        L22:
            java.lang.String r1 = "zh-TW"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L7e
            goto L71
        L2b:
            java.lang.String r1 = "zh-CN"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4f
            goto L71
        L34:
            java.lang.String r1 = "ko-KR"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L59
            goto L71
        L3d:
            java.lang.String r1 = "ja-JP"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L61
            goto L71
        L46:
            java.lang.String r1 = "zh"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4f
            goto L71
        L4f:
            java.lang.String r0 = "cn"
            return r0
        L52:
            boolean r1 = r0.equals(r3)
            if (r1 != 0) goto L59
            goto L71
        L59:
            return r3
        L5a:
            boolean r1 = r0.equals(r2)
            if (r1 != 0) goto L61
            goto L71
        L61:
            return r2
        L62:
            boolean r1 = r0.equals(r4)
            if (r1 != 0) goto L7a
            goto L71
        L69:
            java.lang.String r1 = "zh_TW_#Hant"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L7e
        L71:
            java.lang.String r1 = "es-"
            r2 = 0
            boolean r0 = defpackage.c5e.C(r0, r1, r2)
            if (r0 == 0) goto L7b
        L7a:
            return r4
        L7b:
            java.lang.String r0 = "en"
            return r0
        L7e:
            java.lang.String r0 = "tc"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd8.d():java.lang.String");
    }
}
