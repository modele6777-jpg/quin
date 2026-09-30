package defpackage;

import androidx.compose.foundation.layout.b;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.xml.sax.Attributes;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class ib8 {
    public static int a(int i, int i2, int i3, int i4) {
        return j72.d(i) + i2 + i3 + i4;
    }

    public static int b(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int c(Map map, int i, int i2) {
        return (map.hashCode() + i) * i2;
    }

    public static int d(Attributes attributes, int i) {
        return obc.a(attributes.getLocalName(i)).ordinal();
    }

    public static u69 e(l46 l46Var) {
        u69 u69Var = new u69();
        l46Var.p0(u69Var);
        return u69Var;
    }

    public static e1b f(long j, pr4 pr4Var) {
        return pr4Var.a(new y72(j));
    }

    public static ckd g(yw0 yw0Var, t09 t09Var) {
        ckd ckdVar = new ckd(yw0Var);
        t09Var.a(ckdVar);
        return ckdVar;
    }

    public static pwf h(l46 l46Var, int i, l46 l46Var2, boolean z) {
        l46Var.f0(i);
        pwf pwfVarA = qd8.a(l46Var2);
        l46Var.r(z);
        return pwfVarA;
    }

    public static String i() {
        String string = UUID.randomUUID().toString();
        string.getClass();
        return string;
    }

    public static String j(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String k(String str, String str2, List list) {
        return str + list + str2;
    }

    public static String l(StringBuilder sb, char c, String str, char c2, o4e o4eVar) {
        sb.append(c);
        sb.append(str);
        sb.append(c2);
        sb.append(o4eVar);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder n(int i, int i2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder o(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static StringBuilder p(String str, String str2, String str3, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
        sb.append(str3);
        return sb;
    }

    public static Map q(String str, yi7 yi7Var) {
        return bm8.G(new iy9(str, yi7Var));
    }

    public static void r(float f, int i, l46 l46Var, l46 l46Var2, g09 g09Var) {
        l46Var.f0(i);
        o5c.f(l46Var2, b.d(g09Var, f));
    }

    public static void s(int i, l46 l46Var, he2 he2Var, l46 l46Var2) {
        dec.l(he2Var, l46Var, Integer.valueOf(i));
        dec.k(l46Var2);
    }

    public static void t(l46 l46Var, boolean z, g09 g09Var, float f, l46 l46Var2) {
        l46Var.r(z);
        o5c.f(l46Var2, b.d(g09Var, f));
    }

    public static void u(Integer num, ly lyVar, da9 da9Var) {
        num.getClass();
        lyVar.getClass();
        da9Var.getClass();
    }

    public static void v(StringBuilder sb, String str, String str2, List list, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(list);
        sb.append(str3);
    }

    public static void w(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static /* synthetic */ String x(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        throw null;
    }

    public static /* synthetic */ String y(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "POST";
        }
        return "GET";
    }

    public static /* synthetic */ int z(String str) {
        if (str == null) {
            r82.g("Name is null");
            return 0;
        }
        if (str.equals("px")) {
            return 1;
        }
        if (str.equals("em")) {
            return 2;
        }
        if (str.equals("ex")) {
            return 3;
        }
        if (str.equals("in")) {
            return 4;
        }
        if (str.equals("cm")) {
            return 5;
        }
        if (str.equals("mm")) {
            return 6;
        }
        if (str.equals("pt")) {
            return 7;
        }
        if (str.equals("pc")) {
            return 8;
        }
        if (str.equals("percent")) {
            return 9;
        }
        qc0.j("No enum constant com.caverock.androidsvg.SVG.Unit.".concat(str));
        return 0;
    }
}
