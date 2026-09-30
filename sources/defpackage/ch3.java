package defpackage;

import ai.askquin.R;
import androidx.compose.ui.node.LayoutNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ch3 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ ch3(List list, int i) {
        this.a = 0;
        this.b = list;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b A[LOOP:0: B:19:0x005b->B:30:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5 A[LOOP:2: B:36:0x0096->B:47:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0031  */
    /* JADX WARN: Code duplicated, block: B:90:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0031 A[SYNTHETIC] */
    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) throws IOException {
        Object next;
        String str;
        iy9 iy9Var;
        String str2;
        Object next2;
        String str3;
        String str4;
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = 0;
        List list = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                abg.n(list, (l46) obj, k99.P(1));
                return wefVar;
            case 1:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g09 g09Var = g09.a;
                    j09 j09VarZ = ynb.Z(g09Var, 24.0f);
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarZ);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    String strQ = afc.q(R.string.gift_card_purchase_notice_title, l46Var);
                    long j = ((e8b) l46Var.k(l8b.a)).t;
                    mue mueVar = oue.a;
                    nte.b(strQ, null, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.f(l46Var), l46Var, 0, 0, 131066);
                    ArrayList arrayList = new ArrayList(t72.u(list, 10));
                    for (Object obj3 : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            t72.Z();
                            throw null;
                        }
                        arrayList.add(i3 + ". " + ((String) obj3));
                        i2 = i3;
                    }
                    String strD0 = s72.D0(arrayList, "\n", null, null, null, 62);
                    j09 j09VarD0 = ynb.d0(0.0f, 12.0f, 0.0f, 0.0f, 13, g09Var);
                    long j2 = ((e8b) l46Var.k(l8b.a)).s;
                    mue mueVar2 = oue.a;
                    nte.b(strD0, j09VarD0, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, 48, 0, 131064);
                    l46Var.r(true);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 2:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        l26 l26Var = (l26) list.get(i4);
                        int iHashCode2 = Long.hashCode(l46Var2.T);
                        lf2.q.getClass();
                        r02 r02Var = hj6.w;
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(r02Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode2));
                        l26Var.z(l46Var2, 0);
                        l46Var2.r(true);
                    }
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                charSequence.getClass();
                if (list.size() == 1) {
                    String str5 = (String) s72.W0(list);
                    int iO = v4e.O(charSequence, str5, iIntValue3, false, 4);
                    if (iO < 0) {
                        iy9Var = null;
                    } else {
                        iy9Var = new iy9(Integer.valueOf(iO), str5);
                    }
                } else {
                    if (iIntValue3 < 0) {
                        iIntValue3 = 0;
                    }
                    z67 z67Var = new z67(iIntValue3, charSequence.length(), 1);
                    boolean z = charSequence instanceof String;
                    int i5 = z67Var.c;
                    int i6 = z67Var.b;
                    if (z) {
                        if ((i5 <= 0 || iIntValue3 > i6) && (i5 >= 0 || i6 > iIntValue3)) {
                            iy9Var = null;
                        } else {
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        iy9Var = new iy9(Integer.valueOf(iIntValue3), str3);
                                    } else if (iIntValue3 != i6) {
                                        iIntValue3 += i5;
                                    } else {
                                        iy9Var = null;
                                    }
                                } while (!str4.regionMatches(0, (String) charSequence, iIntValue3, str4.length()));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    iy9Var = new iy9(Integer.valueOf(iIntValue3), str3);
                                } else if (iIntValue3 != i6) {
                                    iIntValue3 += i5;
                                } else {
                                    iy9Var = null;
                                }
                            }
                        }
                    } else if ((i5 <= 0 || iIntValue3 > i6) && (i5 >= 0 || i6 > iIntValue3)) {
                        iy9Var = null;
                    } else {
                        int i7 = iIntValue3;
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    iy9Var = new iy9(Integer.valueOf(i7), str);
                                } else if (i7 != i6) {
                                    i7 += i5;
                                } else {
                                    iy9Var = null;
                                }
                            } while (!v4e.X(str2, 0, charSequence, i7, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                iy9Var = new iy9(Integer.valueOf(i7), str);
                            } else if (i7 != i6) {
                                i7 += i5;
                            } else {
                                iy9Var = null;
                            }
                        }
                    }
                }
                if (iy9Var != null) {
                    return new iy9(iy9Var.d(), Integer.valueOf(((String) iy9Var.e()).length()));
                }
                return null;
        }
    }

    public /* synthetic */ ch3(List list, int i, byte b) {
        this.a = i;
        this.b = list;
    }
}
