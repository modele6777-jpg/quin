package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sb0 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l26 b;

    public /* synthetic */ sb0(int i, l26 l26Var) {
        this.a = i;
        this.b = l26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ucc uccVar;
        int i = this.a;
        wef wefVar = wef.a;
        l26 l26Var = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pr4 pr4Var = nte.a;
                    mue mueVar = pue.a;
                    mh3.a(pr4Var.a(mue.a(pue.b(l46Var), ((e8b) l46Var.k(l8b.a)).q, 0L, null, null, 0L, null, 3, w6c.k(27.2d), null, null, 16613374)), af1.b0(-1587085454, new sb0(i2, l26Var), l46Var), l46Var, 56);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l26Var.z(l46Var2, 0);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 2:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l26Var.z(l46Var3, 0);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 3:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l26Var.z(l46Var4, 0);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 4:
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    l26Var.z(l46Var5, 0);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 5:
                pcc pccVar = (pcc) obj;
                List list = (List) l26Var.z(pccVar, obj2);
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Object obj3 = list.get(i3);
                    if (obj3 != null && (uccVar = pccVar.b) != null && !uccVar.c(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i3 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list.isEmpty()) {
                    return null;
                }
                return new ArrayList(list);
            default:
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    l26Var.z(l46Var6, 0);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
        }
    }
}
