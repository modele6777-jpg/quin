package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k04 implements a26 {
    public final /* synthetic */ int a;
    public final n04 b;

    public /* synthetic */ k04(n04 n04Var, int i) {
        this.a = i;
        this.b = n04Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        rz3 rz3Var;
        int i = this.a;
        Collection<kza> collectionA = pu4.a;
        n04 n04Var = this.b;
        switch (i) {
            case 0:
                t99 t99Var = (t99) obj;
                t99Var.getClass();
                LinkedHashMap linkedHashMap = n04Var.a;
                gl7 gl7Var = dza.b;
                gl7Var.getClass();
                o04 o04Var = n04Var.i;
                byte[] bArr = (byte[]) linkedHashMap.get(t99Var);
                if (bArr != null) {
                    collectionA = fyc.A(fyc.t(new m04(gl7Var, new ByteArrayInputStream(bArr), o04Var, 0)));
                }
                ArrayList arrayList = new ArrayList(collectionA.size());
                for (dza dzaVar : collectionA) {
                    yq8 yq8Var = (yq8) o04Var.b.x;
                    dzaVar.getClass();
                    r04 r04VarF = yq8Var.f(dzaVar);
                    if (!o04Var.r(r04VarF)) {
                        r04VarF = null;
                    }
                    if (r04VarF != null) {
                        arrayList.add(r04VarF);
                    }
                }
                o04Var.j(t99Var, arrayList);
                return z7f.z(arrayList);
            case 1:
                t99 t99Var2 = (t99) obj;
                t99Var2.getClass();
                LinkedHashMap linkedHashMap2 = n04Var.b;
                gl7 gl7Var2 = kza.b;
                gl7Var2.getClass();
                o04 o04Var2 = n04Var.i;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(t99Var2);
                if (bArr2 != null) {
                    collectionA = fyc.A(fyc.t(new m04(gl7Var2, new ByteArrayInputStream(bArr2), o04Var2, 0)));
                }
                ArrayList arrayList2 = new ArrayList(collectionA.size());
                for (kza kzaVar : collectionA) {
                    yq8 yq8Var2 = (yq8) o04Var2.b.x;
                    kzaVar.getClass();
                    arrayList2.add(yq8Var2.g(kzaVar, false));
                }
                o04Var2.k(t99Var2, arrayList2);
                return z7f.z(arrayList2);
            default:
                t99 t99Var3 = (t99) obj;
                t99Var3.getClass();
                lp0 lp0Var = n04Var.i.b;
                byte[] bArr3 = (byte[]) n04Var.c.get(t99Var3);
                if (bArr3 == null) {
                    return null;
                }
                xza xzaVar = (xza) xza.b.b(new ByteArrayInputStream(bArr3), ((tz3) lp0Var.b).p);
                if (xzaVar == null) {
                    return null;
                }
                yq8 yq8Var3 = (yq8) lp0Var.x;
                lp0 lp0Var2 = yq8Var3.a;
                u99 u99Var = (u99) lp0Var2.c;
                bu3 bu3Var = (bu3) lp0Var2.e;
                List<kya> listK = xzaVar.K();
                listK.getClass();
                ArrayList arrayList3 = new ArrayList(t72.u(listK, 10));
                for (kya kyaVar : listK) {
                    a90 a90Var = yq8Var3.b;
                    kyaVar.getClass();
                    arrayList3.add(a90Var.C(kyaVar, u99Var));
                }
                h10 j10Var = arrayList3.isEmpty() ? hj6.c : new j10(0, arrayList3);
                j0b j0bVar = (j0b) oi5.d.e(xzaVar.O());
                switch (j0bVar == null ? -1 : r0b.b[j0bVar.ordinal()]) {
                    case 1:
                        rz3Var = sz3.d;
                        rz3Var.getClass();
                        break;
                    case 2:
                        rz3Var = sz3.a;
                        rz3Var.getClass();
                        break;
                    case 3:
                        rz3Var = sz3.b;
                        rz3Var.getClass();
                        break;
                    case 4:
                        rz3Var = sz3.c;
                        rz3Var.getClass();
                        break;
                    case 5:
                        rz3Var = sz3.e;
                        rz3Var.getClass();
                        break;
                    case 6:
                        rz3Var = sz3.f;
                        rz3Var.getClass();
                        break;
                    default:
                        rz3Var = sz3.a;
                        rz3Var.getClass();
                        break;
                }
                s04 s04Var = new s04(((tz3) lp0Var2.b).a, (bm3) lp0Var2.d, j10Var, i7h.v(u99Var, xzaVar.P()), rz3Var, xzaVar, (u99) lp0Var2.c, bu3Var, (otf) lp0Var2.f, (f04) lp0Var2.v);
                List listQ = xzaVar.Q();
                listQ.getClass();
                o7f o7fVar = (o7f) lp0Var2.b(s04Var, listQ, (u99) lp0Var2.c, (bu3) lp0Var2.e, (otf) lp0Var2.f, (ay0) lp0Var2.g).w;
                s04Var.G0(o7fVar.b(), o7fVar.d(feg.Z(xzaVar, bu3Var), false), o7fVar.d(feg.E(xzaVar, bu3Var), false));
                return s04Var;
        }
    }
}
