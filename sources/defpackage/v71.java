package defpackage;

import androidx.appcompat.widget.ActionBarContextView;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v71 implements uwf {
    public boolean a;
    public int b;
    public Object c;

    public v71(int i) {
        this.a = false;
        this.c = j71.b;
        this.b = i;
    }

    public static int d(ArrayList arrayList, int i, fac facVar) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        Object obj = arrayList.get(i);
        dac dacVar = facVar.b;
        if (obj != dacVar) {
            return -1;
        }
        Iterator it = dacVar.a().iterator();
        while (it.hasNext()) {
            if (((hac) it.next()) == facVar) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static ArrayList f(i71 i71Var) {
        ArrayList arrayList = new ArrayList();
        while (!i71Var.z()) {
            String str = (String) i71Var.d;
            String strSubstring = null;
            if (!i71Var.z()) {
                int i = i71Var.b;
                char cCharAt = str.charAt(i);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    i71Var.b = i;
                } else {
                    int iH = i71Var.h();
                    while (true) {
                        if ((iH < 65 || iH > 90) && (iH < 97 || iH > 122)) {
                            break;
                        }
                        iH = i71Var.h();
                    }
                    strSubstring = str.substring(i, i71Var.b);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(j71.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!i71Var.e0()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean i(t71 t71Var, int i, ArrayList arrayList, int i2, fac facVar) {
        u71 u71Var = (u71) t71Var.a.get(i);
        if (!l(u71Var, facVar)) {
            return false;
        }
        int i3 = u71Var.a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 >= 0) {
                    if (!k(t71Var, i - 1, arrayList, i2)) {
                        i2--;
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return k(t71Var, i - 1, arrayList, i2);
        }
        int iD = d(arrayList, i2, facVar);
        if (iD <= 0) {
            return false;
        }
        return i(t71Var, i - 1, arrayList, i2, (fac) facVar.b.a().get(iD - 1));
    }

    public static boolean j(t71 t71Var, fac facVar) {
        ArrayList arrayList = new ArrayList();
        Object obj = facVar.b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((hac) obj).b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = t71Var.a;
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        ArrayList arrayList3 = t71Var.a;
        if (size2 == 1) {
            return l((u71) arrayList3.get(0), facVar);
        }
        return i(t71Var, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, facVar);
    }

    public static boolean k(t71 t71Var, int i, ArrayList arrayList, int i2) {
        u71 u71Var = (u71) t71Var.a.get(i);
        fac facVar = (fac) arrayList.get(i2);
        if (!l(u71Var, facVar)) {
            return false;
        }
        int i3 = u71Var.a;
        if (i3 == 1) {
            if (i != 0) {
                while (i2 > 0) {
                    i2--;
                    if (k(t71Var, i - 1, arrayList, i2)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (i3 == 2) {
            return k(t71Var, i - 1, arrayList, i2 - 1);
        }
        int iD = d(arrayList, i2, facVar);
        if (iD <= 0) {
            return false;
        }
        return i(t71Var, i - 1, arrayList, i2, (fac) facVar.b.a().get(iD - 1));
    }

    public static boolean l(u71 u71Var, fac facVar) {
        ArrayList arrayList;
        String str = u71Var.b;
        if (str != null && !str.equals(facVar.o().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<g71> arrayList2 = u71Var.c;
        if (arrayList2 != null) {
            for (g71 g71Var : arrayList2) {
                String str2 = g71Var.a;
                String str3 = g71Var.c;
                if (str2.equals("id")) {
                    if (!str3.equals(facVar.c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = facVar.g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = u71Var.d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((k71) it.next()).a(facVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.uwf
    public void a() {
        this.a = true;
    }

    @Override // defpackage.uwf
    public void b() {
        super/*android.view.View*/.setVisibility(0);
        this.a = false;
    }

    @Override // defpackage.uwf
    public void c() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.f = null;
        super/*android.view.View*/.setVisibility(this.b);
    }

    public void e(s71 s71Var, i71 i71Var) throws f71 {
        int iIntValue;
        char cCharAt;
        int iI0;
        String strK0 = i71Var.K0();
        i71Var.f0();
        if (strK0 == null) {
            throw new f71("Invalid '@' rule");
        }
        int i = 0;
        if (!this.a && strK0.equals("media")) {
            ArrayList arrayListF = f(i71Var);
            if (!i71Var.v('{')) {
                throw new f71("Invalid @media rule: missing rule set");
            }
            i71Var.f0();
            j71 j71Var = (j71) this.c;
            Iterator it = arrayListF.iterator();
            while (true) {
                if (!it.hasNext()) {
                    h(i71Var);
                    break;
                }
                j71 j71Var2 = (j71) it.next();
                if (j71Var2 == j71.a || j71Var2 == j71Var) {
                    this.a = true;
                    s71Var.g(h(i71Var));
                    this.a = false;
                    break;
                }
            }
            if (!i71Var.z() && !i71Var.v('}')) {
                throw new f71("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.a || !strK0.equals("import")) {
            b1.l("CSSParser", "Ignoring @" + strK0 + " rule");
            while (!i71Var.z() && ((iIntValue = i71Var.M().intValue()) != 59 || i != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i > 0 && (i = i - 1) == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        } else {
            String strJ0 = null;
            if (!i71Var.z()) {
                int i2 = i71Var.b;
                if (i71Var.w("url(")) {
                    i71Var.f0();
                    String strJ1 = i71Var.J0();
                    if (strJ1 == null) {
                        String str = (String) i71Var.d;
                        StringBuilder sb = new StringBuilder();
                        while (!i71Var.z() && (cCharAt = str.charAt(i71Var.b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !p90.J(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                            i71Var.b++;
                            if (cCharAt == '\\') {
                                if (!i71Var.z()) {
                                    int i3 = i71Var.b;
                                    i71Var.b = i3 + 1;
                                    cCharAt = str.charAt(i3);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iI1 = i71.I0(cCharAt);
                                        if (iI1 != -1) {
                                            for (int i4 = 1; i4 <= 5 && !i71Var.z() && (iI0 = i71.I0(str.charAt(i71Var.b))) != -1; i4++) {
                                                i71Var.b++;
                                                iI1 = (iI1 * 16) + iI0;
                                            }
                                            sb.append((char) iI1);
                                        }
                                    }
                                }
                            }
                            sb.append(cCharAt);
                        }
                        strJ1 = sb.length() == 0 ? null : sb.toString();
                    }
                    if (strJ1 == null) {
                        i71Var.b = i2;
                    } else {
                        i71Var.f0();
                        if (i71Var.z() || i71Var.w(")")) {
                            strJ0 = strJ1;
                        } else {
                            i71Var.b = i2;
                        }
                    }
                }
            }
            if (strJ0 == null) {
                strJ0 = i71Var.J0();
            }
            if (strJ0 == null) {
                throw new f71("Invalid @import rule: expected string or url()");
            }
            i71Var.f0();
            f(i71Var);
            if (!i71Var.z() && !i71Var.v(';')) {
                throw new f71("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        i71Var.f0();
    }

    public boolean g(s71 s71Var, i71 i71Var) throws f71 {
        ArrayList<t71> arrayListL0 = i71Var.L0();
        if (arrayListL0 == null || arrayListL0.isEmpty()) {
            return false;
        }
        if (!i71Var.v('{')) {
            throw new f71("Malformed rule block: expected '{'");
        }
        i71Var.f0();
        z9c z9cVar = new z9c();
        do {
            String strK0 = i71Var.K0();
            i71Var.f0();
            if (!i71Var.v(':')) {
                throw new f71("Expected ':'");
            }
            i71Var.f0();
            String str = (String) i71Var.d;
            String strSubstring = null;
            if (!i71Var.z()) {
                int i = i71Var.b;
                int iCharAt = str.charAt(i);
                int i2 = i;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!p90.J(iCharAt)) {
                        i2 = i71Var.b + 1;
                    }
                    iCharAt = i71Var.h();
                }
                if (i71Var.b > i) {
                    strSubstring = str.substring(i, i2);
                } else {
                    i71Var.b = i;
                }
            }
            if (strSubstring == null) {
                throw new f71("Expected property value");
            }
            i71Var.f0();
            if (i71Var.v('!')) {
                i71Var.f0();
                if (!i71Var.w("important")) {
                    throw new f71("Malformed rule set: found unexpected '!'");
                }
                i71Var.f0();
            }
            i71Var.v(';');
            rbc.C(z9cVar, strK0, strSubstring);
            i71Var.f0();
            if (i71Var.z()) {
                break;
            }
        } while (!i71Var.v('}'));
        i71Var.f0();
        for (t71 t71Var : arrayListL0) {
            int i3 = this.b;
            r71 r71Var = new r71();
            r71Var.a = t71Var;
            r71Var.b = z9cVar;
            r71Var.c = i3;
            s71Var.f(r71Var);
        }
        return true;
    }

    public s71 h(i71 i71Var) {
        s71 s71Var = new s71(0);
        while (!i71Var.z()) {
            try {
                if (!i71Var.w("<!--") && !i71Var.w("-->")) {
                    if (!i71Var.v('@')) {
                        if (!g(s71Var, i71Var)) {
                            break;
                        }
                    } else {
                        e(s71Var, i71Var);
                    }
                }
            } catch (f71 e) {
                b1.d("CSSParser", "CSS parser terminated early due to error: " + e.getMessage());
                return s71Var;
            }
        }
        return s71Var;
    }

    public v71(tjd tjdVar, int i, boolean z) {
        this.c = tjdVar;
        this.b = i;
        this.a = z;
    }
}
