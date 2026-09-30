package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r4e implements m0a {
    public final vd9 a;
    public final String b;
    public final q4e c = new q4e();

    public r4e(Collection collection, vd9 vd9Var, String str) {
        int i;
        this.a = vd9Var;
        this.b = str;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.length() <= 0) {
                qc0.o("Found an empty string in ".concat(this.b));
                throw null;
            }
            q4e q4eVar = this.c;
            int length = str2.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str2.charAt(i2);
                List list = q4eVar.a;
                String strValueOf = String.valueOf(cCharAt);
                int size = list.size();
                t72.V(list.size(), size);
                int i3 = size - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i = -(i4 + 1);
                        break;
                    }
                    i = (i4 + i3) >>> 1;
                    int iM = i7h.m((String) ((iy9) list.get(i)).d(), strValueOf);
                    if (iM < 0) {
                        i4 = i + 1;
                    } else if (iM <= 0) {
                        break;
                    } else {
                        i3 = i - 1;
                    }
                }
                if (i < 0) {
                    q4e q4eVar2 = new q4e();
                    list.add((-i) - 1, new iy9(String.valueOf(cCharAt), q4eVar2));
                    q4eVar = q4eVar2;
                } else {
                    q4eVar = (q4e) ((iy9) list.get(i)).e();
                }
            }
            if (q4eVar.b) {
                qc0.o(ib8.j("The string '", str2, "' was passed several times"));
                throw null;
            }
            q4eVar.b = true;
        }
        b(this.c);
    }

    public static final void b(q4e q4eVar) {
        List<iy9> list = q4eVar.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((q4e) ((iy9) it.next()).b());
        }
        ArrayList arrayList = new ArrayList();
        for (iy9 iy9Var : list) {
            String str = (String) iy9Var.a();
            q4e q4eVar2 = (q4e) iy9Var.b();
            boolean z = q4eVar2.b;
            List list2 = q4eVar2.a;
            if (z || list2.size() != 1) {
                arrayList.add(new iy9(str, q4eVar2));
            } else {
                iy9 iy9Var2 = (iy9) s72.X0(list2);
                String str2 = (String) iy9Var2.a();
                arrayList.add(new iy9(tec.l(str, str2), (q4e) iy9Var2.b()));
            }
        }
        list.clear();
        list.addAll(s72.b1(arrayList, new kv8(17)));
    }

    @Override // defpackage.m0a
    public final Object a(gu2 gu2Var, CharSequence charSequence, int i) {
        String str;
        q4e q4eVar;
        CharSequence charSequence2;
        boolean zX;
        charSequence.getClass();
        kmb kmbVar = new kmb();
        kmbVar.element = i;
        q4e q4eVar2 = this.c;
        Integer numValueOf = null;
        loop0: while (kmbVar.element <= charSequence.length()) {
            if (q4eVar2.b) {
                numValueOf = Integer.valueOf(kmbVar.element);
            }
            Iterator it = q4eVar2.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                iy9 iy9Var = (iy9) it.next();
                str = (String) iy9Var.a();
                q4eVar = (q4e) iy9Var.b();
                int i2 = kmbVar.element;
                str.getClass();
                if (charSequence instanceof String) {
                    zX = c5e.B(i2, (String) charSequence, str, false);
                    charSequence2 = charSequence;
                } else {
                    charSequence2 = charSequence;
                    zX = v4e.X(charSequence2, i2, str, 0, str.length(), false);
                }
                if (zX) {
                    break;
                }
                charSequence = charSequence2;
            }
            kmbVar.element = str.length() + kmbVar.element;
            q4eVar2 = q4eVar;
            charSequence = charSequence2;
        }
        CharSequence charSequence3 = charSequence;
        if (numValueOf == null) {
            return new e0a(i, new bl(this, charSequence3, i, kmbVar, 6));
        }
        String string = charSequence3.subSequence(i, numValueOf.intValue()).toString();
        vd9 vd9Var = this.a;
        Object objE = vd9Var.e(gu2Var, string);
        return objE == null ? numValueOf : new e0a(i, new ek9(objE, string, vd9Var));
    }
}
