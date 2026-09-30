package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public final class ln7 implements x16 {
    public final /* synthetic */ int a;
    public final mn7 b;
    public final nn7 c;

    public ln7(nn7 nn7Var, mn7 mn7Var) {
        this.a = 0;
        this.c = nn7Var;
        this.b = mn7Var;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    @Override // defpackage.x16
    public final Object invoke() throws ClassNotFoundException {
        String str;
        wn7 vs7Var;
        int i = this.a;
        nn7 nn7Var = this.c;
        mn7 mn7Var = this.b;
        switch (i) {
            case 0:
                Class cls = nn7Var.b;
                boolean z = rce.c;
                Iterable<dr8> iterableG0 = pu4.a;
                if (!z) {
                    fob fobVar = mn7Var.e;
                    wn7 wn7Var = mn7.g[1];
                    Object objInvoke = fobVar.invoke();
                    objInvoke.getClass();
                    dr8 dr8Var = (dr8) objInvoke;
                    if (dr8Var instanceof p04) {
                        iterableG0 = t72.H(dr8Var);
                    } else if (dr8Var instanceof sv1) {
                        iterableG0 = qd0.G0(((sv1) dr8Var).c);
                    }
                    ArrayList arrayList = new ArrayList(t72.u(iterableG0, 10));
                    for (dr8 dr8Var2 : iterableG0) {
                        dr8Var2.getClass();
                        p04 p04Var = (p04) dr8Var2;
                        arrayList.add(db6.T0(p04Var.h, (u99) p04Var.b.c, false, 6));
                    }
                    return arrayList;
                }
                Metadata metadata = (Metadata) cls.getAnnotation(Metadata.class);
                cgg cggVarO = metadata != null ? feg.O(metadata) : null;
                if (cggVarO instanceof bs7) {
                    return t72.H(((bs7) cggVarO).s);
                }
                if (cggVarO instanceof ds7) {
                    return t72.H(((ds7) cggVarO).s);
                }
                if (!(cggVarO instanceof cs7)) {
                    return iterableG0;
                }
                List list = ((cs7) cggVarO).s;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Class<?> clsLoadClass = smb.d(cls).loadClass(c5e.z((String) it.next(), '/', '.'));
                    clsLoadClass.getClass();
                    vm7 vm7Var = (vm7) y81.b.z(clsLoadClass);
                    vm7Var.getClass();
                    x72.g0(arrayList2, (List) ((mn7) ((nn7) vm7Var).c.getValue()).c.getValue());
                }
                return arrayList2;
            case 1:
                fob fobVar2 = mn7Var.d;
                wn7 wn7Var2 = mn7.g[0];
                cob cobVar = (cob) fobVar2.invoke();
                if (cobVar != null) {
                    zr7 zr7Var = cobVar.b;
                    str = zr7Var.f;
                    if (zr7Var.a != yr7.MULTIFILE_CLASS_PART) {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (str == null || str.length() <= 0) {
                    return null;
                }
                ClassLoader classLoaderD = smb.d(nn7Var.b);
                String strReplace = str.replace('/', '.');
                strReplace.getClass();
                return classLoaderD.loadClass(strReplace);
            default:
                boolean z2 = rce.a;
                nn7 nn7Var2 = this.c;
                if (z2) {
                    mm7 mm7Var = new mm7(nn7Var2, 1);
                    fob fobVar3 = mn7Var.e;
                    wn7 wn7Var3 = mn7.g[1];
                    Object objInvoke2 = fobVar3.invoke();
                    objInvoke2.getClass();
                    Collection<bm3> collectionF = mxb.f((dr8) objInvoke2, null, 3);
                    ArrayList arrayList3 = new ArrayList();
                    for (bm3 bm3Var : collectionF) {
                        rx3 rx3Var = bm3Var instanceof ea1 ? (rx3) bm3Var.D(mm7Var, wef.a) : null;
                        if (rx3Var != null) {
                            arrayList3.add(rx3Var);
                        }
                    }
                    return s72.j1(arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                for (tq7 tq7Var : (List) mn7Var.c.getValue()) {
                    for (uq7 uq7Var : tq7Var.b) {
                        uq7Var.getClass();
                        String str2 = uq7Var.b;
                        byte b = uq7Var.h.isEmpty() ? uq7Var.f != null ? (byte) 1 : (byte) 0 : (byte) -1;
                        String strS = abg.s(uq7Var, nn7Var2);
                        if (strS == null) {
                            throw new pt7(ub3.i("No field or getter signature for property: ", str2));
                        }
                        Object obj = ga1.NO_RECEIVER;
                        if (si0.q.F(si0.a[36], uq7Var)) {
                            if (b == -1) {
                                vs7Var = new vs7(nn7Var2, strS, obj, uq7Var, dm7.j);
                            } else if (b == 0) {
                                vs7Var = new rs7(nn7Var2, strS, obj, uq7Var, dm7.j);
                            } else if (b != 1) {
                                vs7Var = null;
                            } else {
                                vs7Var = new ts7(nn7Var2, strS, obj, uq7Var, dm7.j);
                            }
                        } else if (b == -1) {
                            vs7Var = new mt7(nn7Var2, strS, obj, uq7Var, dm7.j);
                        } else if (b == 0) {
                            vs7Var = new gt7(nn7Var2, strS, obj, uq7Var, dm7.j);
                        } else if (b != 1) {
                            vs7Var = null;
                        } else {
                            vs7Var = new jt7(nn7Var2, strS, obj, uq7Var, dm7.j);
                        }
                        if (vs7Var == null) {
                            StringBuilder sbO = ib8.o("Unsupported property: name=", str2, " signature=", strS, " container=");
                            sbO.append(nn7Var2);
                            throw new pt7(sbO.toString());
                        }
                        arrayList4.add(vs7Var);
                    }
                    for (sq7 sq7Var : tq7Var.a) {
                        sq7Var.getClass();
                        vk7 vk7Var = cn1.C(sq7Var).a;
                        if (vk7Var == null) {
                            yg5.t(sq7Var.b, "No signature for function: ");
                            return null;
                        }
                        arrayList4.add(new xs7(nn7Var2, vk7Var.toString(), ga1.NO_RECEIVER, sq7Var, dm7.j));
                    }
                }
                return s72.j1(arrayList4);
        }
    }

    public /* synthetic */ ln7(mn7 mn7Var, nn7 nn7Var, int i) {
        this.a = i;
        this.b = mn7Var;
        this.c = nn7Var;
    }
}
