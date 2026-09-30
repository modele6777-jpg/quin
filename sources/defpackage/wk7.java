package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wk7 implements u99 {
    public static final List d;
    public final String[] a;
    public final Set b;
    public final ArrayList c;

    static {
        String strD0 = s72.D0(t72.I('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listI = t72.I(strD0.concat("/Any"), strD0.concat("/Nothing"), strD0.concat("/Unit"), strD0.concat("/Throwable"), strD0.concat("/Number"), strD0.concat("/Byte"), strD0.concat("/Double"), strD0.concat("/Float"), strD0.concat("/Int"), strD0.concat("/Long"), strD0.concat("/Short"), strD0.concat("/Boolean"), strD0.concat("/Char"), strD0.concat("/CharSequence"), strD0.concat("/String"), strD0.concat("/Comparable"), strD0.concat("/Enum"), strD0.concat("/Array"), strD0.concat("/ByteArray"), strD0.concat("/DoubleArray"), strD0.concat("/FloatArray"), strD0.concat("/IntArray"), strD0.concat("/LongArray"), strD0.concat("/ShortArray"), strD0.concat("/BooleanArray"), strD0.concat("/CharArray"), strD0.concat("/Cloneable"), strD0.concat("/Annotation"), strD0.concat("/collections/Iterable"), strD0.concat("/collections/MutableIterable"), strD0.concat("/collections/Collection"), strD0.concat("/collections/MutableCollection"), strD0.concat("/collections/List"), strD0.concat("/collections/MutableList"), strD0.concat("/collections/Set"), strD0.concat("/collections/MutableSet"), strD0.concat("/collections/Map"), strD0.concat("/collections/MutableMap"), strD0.concat("/collections/Map.Entry"), strD0.concat("/collections/MutableMap.MutableEntry"), strD0.concat("/collections/Iterator"), strD0.concat("/collections/MutableIterator"), strD0.concat("/collections/ListIterator"), strD0.concat("/collections/MutableListIterator"));
        d = listI;
        sd0 sd0VarQ1 = s72.q1(listI);
        int iF = bm8.F(t72.u(sd0VarQ1, 10));
        if (iF < 16) {
            iF = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
        Iterator it = sd0VarQ1.iterator();
        while (true) {
            iq4 iq4Var = (iq4) it;
            if (!iq4Var.b.hasNext()) {
                return;
            }
            n17 n17Var = (n17) iq4Var.next();
            linkedHashMap.put((String) n17Var.b, Integer.valueOf(n17Var.a));
        }
    }

    public wk7(ql7 ql7Var, String[] strArr) {
        strArr.getClass();
        List listO = ql7Var.o();
        Set setO1 = listO.isEmpty() ? xu4.a : s72.o1(listO);
        List<pl7> listP = ql7Var.p();
        listP.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(listP.size());
        for (pl7 pl7Var : listP) {
            int iW = pl7Var.w();
            for (int i = 0; i < iW; i++) {
                arrayList.add(pl7Var);
            }
        }
        arrayList.trimToSize();
        this.a = strArr;
        this.b = setO1;
        this.c = arrayList;
    }

    @Override // defpackage.u99
    public final String a(int i) {
        return getString(i);
    }

    @Override // defpackage.u99
    public final boolean b(int i) {
        return this.b.contains(Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    @Override // defpackage.u99
    public final String getString(int i) {
        String strReplace;
        pl7 pl7Var = (pl7) this.c.get(i);
        if (pl7Var.G()) {
            strReplace = pl7Var.A();
        } else if (pl7Var.E()) {
            List list = d;
            int size = list.size();
            int iV = pl7Var.v();
            if (iV < 0 || iV >= size) {
                strReplace = this.a[i];
            } else {
                strReplace = (String) list.get(pl7Var.v());
            }
        } else {
            strReplace = this.a[i];
        }
        if (pl7Var.B() >= 2) {
            List listC = pl7Var.C();
            listC.getClass();
            Integer num = (Integer) listC.get(0);
            Integer num2 = (Integer) listC.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strReplace.length()) {
                strReplace = strReplace.substring(num.intValue(), num2.intValue());
            }
        }
        if (pl7Var.x() >= 2) {
            List listZ = pl7Var.z();
            listZ.getClass();
            Integer num3 = (Integer) listZ.get(0);
            Integer num4 = (Integer) listZ.get(1);
            strReplace.getClass();
            strReplace = strReplace.replace((char) num3.intValue(), (char) num4.intValue());
            strReplace.getClass();
        }
        ol7 ol7VarU = pl7Var.u();
        if (ol7VarU == null) {
            ol7VarU = ol7.NONE;
        }
        int iOrdinal = ol7VarU.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                strReplace.getClass();
                strReplace = strReplace.replace('$', '.');
                strReplace.getClass();
            } else {
                if (iOrdinal != 2) {
                    ap.c();
                    return null;
                }
                if (strReplace.length() >= 2) {
                    strReplace = strReplace.substring(1, strReplace.length() - 1);
                }
                strReplace = strReplace.replace('$', '.');
                strReplace.getClass();
            }
        }
        strReplace.getClass();
        return strReplace;
    }
}
