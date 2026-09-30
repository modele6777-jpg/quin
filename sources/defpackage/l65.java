package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.events.model.ExploreBanner;
import tech.chatmind.api.server.NullableServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l65 implements w55, hf8 {
    public static final /* synthetic */ int v = 0;
    public final az4 a;
    public final k65 b;
    public final f99 c;
    public pu3 d;
    public Long e;
    public final mz4 f;
    public final dw1 g;

    public l65(az4 az4Var) {
        this.a = az4Var;
        hs3 hs3Var = xqa.Z;
        isa isaVar = hs3Var.a;
        Object obj = hs3Var.b;
        ypa.a.getClass();
        this.b = new k65(new g65(ypa.b(), isaVar, obj), this);
        this.c = new f99();
        this.f = new mz4(6);
        this.g = new dw1(new y55(this, null), nu4.a, -2, i41.a, 0);
    }

    public final ExploreBanner a(nh7 nh7Var) {
        try {
            xh7 xh7Var = fzc.a;
            xh7Var.getClass();
            return (ExploreBanner) xh7Var.a(ExploreBanner.Companion.serializer(), nh7Var);
        } catch (yyc e) {
            d().g("Skip unparseable explore banner: " + e.getMessage());
            return null;
        }
    }

    public final List b(nh7 nh7Var) {
        if (nh7Var == null || ((nh7Var instanceof ti7) && ((ti7) nh7Var).a.isEmpty())) {
            return pu4.a;
        }
        yg7 yg7Var = nh7Var instanceof yg7 ? (yg7) nh7Var : null;
        if (yg7Var == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<nh7> it = yg7Var.iterator();
        while (it.hasNext()) {
            ExploreBanner exploreBannerA = a(it.next());
            if (exploreBannerA != null) {
                arrayList.add(exploreBannerA);
            }
        }
        if (yg7Var.a.isEmpty() || !arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object c(zn2 zn2Var) throws Throwable {
        z55 z55Var;
        if (zn2Var instanceof z55) {
            z55Var = (z55) zn2Var;
            int i = z55Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                z55Var.label = i - Integer.MIN_VALUE;
            } else {
                z55Var = new z55(this, zn2Var);
            }
        } else {
            z55Var = new z55(this, zn2Var);
        }
        Object objB = z55Var.result;
        int i2 = z55Var.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(objB);
                az4 az4Var = this.a;
                z55Var.label = 1;
                objB = az4Var.b(qu4.a, z55Var);
                if (objB == bw2Var) {
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objB);
                return wefVar;
            }
            jzb.q(objB);
            NullableServerResponse nullableServerResponse = (NullableServerResponse) objB;
            if (!nullableServerResponse.getSuccess()) {
                d().e("explore-banner API returned error: " + nullableServerResponse.getErrorMessage());
                return wefVar;
            }
            List listB = b((nh7) nullableServerResponse.getData());
            if (listB == null) {
                d().e("explore-banner API returned invalid data");
                return wefVar;
            }
            hs3 hs3Var = xqa.Z;
            xh7 xh7Var = fzc.a;
            xh7Var.getClass();
            String strD = xh7Var.d(new dd0(ExploreBanner.Companion.serializer(), 0), listB);
            isa isaVar = hs3Var.a;
            z55Var.L$0 = null;
            z55Var.L$1 = null;
            z55Var.L$2 = null;
            z55Var.L$3 = null;
            z55Var.label = 2;
            return bsa.n(isaVar, strD, z55Var) == bw2Var ? bw2Var : wefVar;
        } catch (yyc e) {
            d().e("Failed to decode explore banners: " + e.getMessage());
        } catch (Exception e2) {
            ynb.h0(e2);
            d().e("Failed to refresh explore banners: " + e2.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007d A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #0 {all -> 0x006d, blocks: (B:20:0x004f, B:22:0x0053, B:27:0x006f, B:29:0x0073, B:34:0x007d), top: B:44:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(zn2 zn2Var) {
        a65 a65Var;
        d99 d99Var;
        pu3 pu3VarX;
        if (zn2Var instanceof a65) {
            a65Var = (a65) zn2Var;
            int i = a65Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                a65Var.label = i - Integer.MIN_VALUE;
            } else {
                a65Var = new a65(this, zn2Var);
            }
        } else {
            a65Var = new a65(this, zn2Var);
        }
        Object obj = a65Var.result;
        int i2 = a65Var.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                d99Var = this.c;
                a65Var.L$0 = d99Var;
                a65Var.label = 1;
                if (d99Var.b(a65Var) != bw2Var) {
                }
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                return wefVar;
            }
            d99Var = (d99) a65Var.L$0;
            jzb.q(obj);
            Long l = this.e;
            if (l == null || ((Number) this.f.invoke()).longValue() - l.longValue() >= 60000) {
                pu3VarX = this.d;
                if (pu3VarX == null) {
                    qn2 qn2Var = lw2.a;
                    js3 js3Var = ga4.a;
                    pu3VarX = ynb.x(qn2Var, hr3.c, dw2.b, new b65(this, null));
                    this.d = pu3VarX;
                    pu3VarX.E(new ks2(28, this, pu3VarX));
                    pu3VarX.start();
                } else {
                    if (!pu3VarX.b()) {
                        pu3VarX = null;
                    }
                    if (pu3VarX == null) {
                        qn2 qn2Var2 = lw2.a;
                        js3 js3Var2 = ga4.a;
                        pu3VarX = ynb.x(qn2Var2, hr3.c, dw2.b, new b65(this, null));
                        this.d = pu3VarX;
                        pu3VarX.E(new ks2(28, this, pu3VarX));
                        pu3VarX.start();
                    }
                }
            } else {
                pu3VarX = null;
            }
            d99Var.h(null);
            if (pu3VarX != null) {
                a65Var.L$0 = null;
                a65Var.label = 2;
                if (pu3VarX.s(a65Var) == bw2Var) {
                    return bw2Var;
                }
            }
            return wefVar;
        } catch (Throwable th) {
            d99Var.h(null);
            throw th;
        }
    }
}
