package defpackage;

import com.adjust.sdk.sig.r3;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w3g implements a26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ w3g(hcg hcgVar, int i, cea ceaVar, int i2, zn8 zn8Var) {
        this.d = hcgVar;
        this.b = i;
        this.e = ceaVar;
        this.c = i2;
        this.f = zn8Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj2 = this.f;
        int i2 = this.c;
        Object obj3 = this.e;
        int i3 = this.b;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                z67 z67Var = (z67) obj3;
                l26 l26Var = (l26) obj2;
                boolean zBooleanValue = ((Boolean) ((List) obj4).get(((Integer) obj).intValue())).booleanValue();
                int iH = uyb.h(i3, zBooleanValue);
                int i4 = z67Var.a;
                if (iH > z67Var.b || i4 > iH) {
                    Iterator it = z67Var.iterator();
                    while (((y67) it).c) {
                        int iNextInt = ((q67) it).nextInt();
                        if ((iNextInt >= 12) == zBooleanValue) {
                            iH = iNextInt;
                        }
                    }
                    r3.n("Collection contains no element matching the predicate.");
                    return null;
                }
                l26Var.z(Integer.valueOf(iH), Integer.valueOf(i2));
                return wefVar;
            default:
                cea ceaVar = (cea) obj3;
                bea.j((bea) obj, ceaVar, ((w67) ((hcg) obj4).F0.z(new e77((((long) (i3 - ceaVar.a)) << 32) | (((long) (i2 - ceaVar.b)) & 4294967295L)), ((zn8) obj2).getLayoutDirection())).a);
                return wefVar;
        }
    }

    public /* synthetic */ w3g(List list, int i, z67 z67Var, l26 l26Var, int i2) {
        this.d = list;
        this.b = i;
        this.e = z67Var;
        this.f = l26Var;
        this.c = i2;
    }
}
