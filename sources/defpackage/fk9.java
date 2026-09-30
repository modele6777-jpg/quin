package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fk9 implements m0a {
    public final List a;
    public final int b;
    public final boolean c;

    public fk9(List list) {
        boolean z;
        this.a = list;
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer num = ((bk9) it.next()).a;
            if (num != null) {
                iIntValue = num.intValue();
            }
            i2 += iIntValue;
        }
        this.b = i2;
        List list2 = this.a;
        if (list2.isEmpty()) {
            z = false;
            break;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((bk9) it2.next()).a == null) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        this.c = z;
        List list3 = this.a;
        if (!list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Integer num2 = ((bk9) it3.next()).a;
                if ((num2 != null ? num2.intValue() : Integer.MAX_VALUE) <= 0) {
                    qc0.j("Failed requirement.");
                    throw null;
                }
            }
        }
        List list4 = this.a;
        if (!list4.isEmpty()) {
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                if (((bk9) it4.next()).a == null && (i = i + 1) < 0) {
                    t72.Y();
                    throw null;
                }
            }
        }
        if (i <= 1) {
            return;
        }
        List list5 = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (((bk9) obj).a == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((bk9) it5.next()).b);
        }
        cva.u(arrayList2, ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.", "At most one variable-length numeric field in a row is allowed, but got several: ");
        throw null;
    }

    @Override // defpackage.m0a
    public final Object a(gu2 gu2Var, CharSequence charSequence, int i) {
        charSequence.getClass();
        int i2 = this.b;
        if (i + i2 > charSequence.length()) {
            return new e0a(i, new zv6(22, this));
        }
        kmb kmbVar = new kmb();
        while (kmbVar.element + i < charSequence.length() && uyb.t(charSequence.charAt(kmbVar.element + i))) {
            kmbVar.element++;
        }
        int i3 = 0;
        if (kmbVar.element < i2) {
            return new e0a(i, new ek9(i3, kmbVar, this));
        }
        List list = this.a;
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            Integer num = ((bk9) list.get(i4)).a;
            int iIntValue = (num != null ? num.intValue() : (kmbVar.element - i2) + 1) + i;
            dk9 dk9VarA = ((bk9) list.get(i4)).a(gu2Var, charSequence, i, iIntValue);
            if (dk9VarA != null) {
                return new e0a(i, new bl(charSequence.subSequence(i, iIntValue).toString(), this, i4, dk9VarA, 5));
            }
            i4++;
            i = iIntValue;
        }
        return Integer.valueOf(i);
    }

    public final String b() {
        List<bk9> list = this.a;
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        for (bk9 bk9Var : list) {
            Integer num = bk9Var.a;
            arrayList.add((num == null ? "at least one digit" : num + " digits") + " for " + bk9Var.b);
        }
        boolean z = this.c;
        int i = this.b;
        if (z) {
            return "a number with at least " + i + " digits: " + arrayList;
        }
        return "a number with exactly " + i + " digits: " + arrayList;
    }

    public final String toString() {
        return b();
    }
}
