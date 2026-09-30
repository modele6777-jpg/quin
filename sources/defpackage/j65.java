package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import tech.chatmind.api.events.model.ExploreBanner;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j65 implements xj5 {
    public final /* synthetic */ xj5 a;
    public final /* synthetic */ l65 b;

    public j65(xj5 xj5Var, l65 l65Var) {
        this.a = xj5Var;
        this.b = l65Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        i65 i65Var;
        ArrayList arrayList;
        if (xn2Var instanceof i65) {
            i65Var = (i65) xn2Var;
            int i = i65Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                i65Var.label = i - Integer.MIN_VALUE;
            } else {
                i65Var = new i65(this, xn2Var);
            }
        } else {
            i65Var = new i65(this, xn2Var);
        }
        Object obj2 = i65Var.result;
        int i2 = i65Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            String str = (String) obj;
            l65 l65Var = this.b;
            int i3 = l65.v;
            int length = str.length();
            Object obj3 = pu4.a;
            if (length != 0) {
                try {
                    nh7 nh7VarE = fzc.a.e(str);
                    yg7 yg7Var = nh7VarE instanceof yg7 ? (yg7) nh7VarE : null;
                    if (yg7Var != null) {
                        arrayList = new ArrayList();
                        Iterator it = yg7Var.a.iterator();
                        while (it.hasNext()) {
                            ExploreBanner exploreBannerA = l65Var.a((nh7) it.next());
                            if (exploreBannerA != null) {
                                arrayList.add(exploreBannerA);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        obj3 = arrayList;
                    }
                } catch (yyc e) {
                    l65Var.d().g("Failed to decode cached explore banners: " + e.getMessage());
                }
            }
            i65Var.L$0 = null;
            i65Var.L$1 = null;
            i65Var.L$2 = null;
            i65Var.L$3 = null;
            i65Var.label = 1;
            Object objA = this.a.a(obj3, i65Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
