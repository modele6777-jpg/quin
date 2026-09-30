package net.xmind.donut.gp;

import android.app.Activity;
import android.text.TextUtils;
import defpackage.a3a;
import defpackage.ap;
import defpackage.az2;
import defpackage.b3a;
import defpackage.b89;
import defpackage.bo1;
import defpackage.bwa;
import defpackage.c3a;
import defpackage.c78;
import defpackage.d3a;
import defpackage.e4b;
import defpackage.e56;
import defpackage.f3a;
import defpackage.f7e;
import defpackage.fwg;
import defpackage.h3a;
import defpackage.hf8;
import defpackage.hj;
import defpackage.hj6;
import defpackage.hwa;
import defpackage.i3a;
import defpackage.ib8;
import defpackage.it3;
import defpackage.iy9;
import defpackage.jc6;
import defpackage.jt3;
import defpackage.k47;
import defpackage.kc6;
import defpackage.l2;
import defpackage.l3a;
import defpackage.lmd;
import defpackage.lw2;
import defpackage.m86;
import defpackage.m8b;
import defpackage.mx4;
import defpackage.nx0;
import defpackage.o14;
import defpackage.o2b;
import defpackage.ox0;
import defpackage.oz5;
import defpackage.p07;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.px0;
import defpackage.qc0;
import defpackage.s2a;
import defpackage.s72;
import defpackage.sx0;
import defpackage.t72;
import defpackage.thb;
import defpackage.tx0;
import defpackage.u7e;
import defpackage.ub3;
import defpackage.uzd;
import defpackage.vb2;
import defpackage.vpf;
import defpackage.w2a;
import defpackage.w37;
import defpackage.wef;
import defpackage.x72;
import defpackage.ynb;
import defpackage.yx4;
import defpackage.z7c;
import defpackage.za6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lnet/xmind/donut/gp/GooglePay;", "Ls2a;", "Lhf8;", "Lpx0;", "Quin:gp_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final class GooglePay implements s2a, hf8, px0 {
    public static final /* synthetic */ int g = 0;
    public final vb2 a;
    public String b;
    public hwa c;
    public final l3a d;
    public final BillingSessionOwner e;
    public final b89 f;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = z7c.f)
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[hwa.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public GooglePay(vb2 vb2Var) {
        this.a = vb2Var;
        l3a l3aVar = new l3a();
        this.d = l3aVar;
        za6 za6Var = new za6(3, this);
        BillingSessionOwnerKt$createBillingSessionOwner$1 billingSessionOwnerKt$createBillingSessionOwner$1 = BillingSessionOwnerKt$createBillingSessionOwner$1.a;
        this.e = new BillingSessionOwner(za6Var);
        b89 b89Var = (b89) l3aVar.b.getValue();
        b89Var.getClass();
        this.f = b89Var;
    }

    @Override // defpackage.px0
    public final void a(tx0 tx0Var) {
        BillingSession billingSession;
        tx0Var.getClass();
        BillingSessionOwner billingSessionOwner = this.e;
        synchronized (billingSessionOwner.b) {
            billingSession = billingSessionOwner.d;
        }
        if (billingSession == null) {
            return;
        }
        c(billingSession, tx0Var);
    }

    @Override // defpackage.px0
    public final void b() {
        BillingSession billingSession;
        BillingSessionOwner billingSessionOwner = this.e;
        synchronized (billingSessionOwner.b) {
            billingSession = billingSessionOwner.d;
        }
        if (billingSession != null && this.e.b(billingSession)) {
            j("Billing service disconnected.");
            this.d.a(i3a.a);
        }
    }

    public final void c(BillingSession billingSession, tx0 tx0Var) {
        if (this.e.b(billingSession)) {
            int i = tx0Var.a;
            if (i == -1) {
                d().e("Billing service disconnected.");
                return;
            }
            int i2 = 1;
            if (i != 0) {
                if (i == 1) {
                    d().e("Billing service user canned.");
                    return;
                }
                j("Fail to setup billing: " + i + ", " + tx0Var.c);
                return;
            }
            d().e("Billing setup finished.");
            hwa hwaVar = this.c;
            if (hwaVar != null) {
                g(hwaVar, billingSession);
            } else {
                g(hwa.a, billingSession);
                g(hwa.b, billingSession);
            }
            ox0 ox0Var = billingSession.a;
            e4b e4bVar = new e4b();
            e4bVar.a = "inapp";
            ox0Var.d(e4bVar.a(), new kc6(this, billingSession, i2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0224  */
    public final void e(tx0 tx0Var, List list) {
        ArrayList arrayList;
        u7e u7eVar;
        Object next;
        GooglePay googlePay = this;
        int i = tx0Var.a;
        d3a d3aVar = d3a.a;
        l3a l3aVar = googlePay.d;
        if (i != 0) {
            w2a w2aVar = w2a.a;
            if (i == 1) {
                l3aVar.a(w2aVar);
                return;
            }
            if (i == 7) {
                googlePay.d().g("Item already owned.");
                l3aVar.a(w2aVar);
                return;
            }
            if (i == 8) {
                l3aVar.a(d3aVar);
                return;
            }
            l3aVar.a(b3a.a);
            googlePay.j("Fail to query purchases: " + tx0Var.a + ", " + tx0Var.c);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((o2b) obj).b() == 1) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            o2b o2bVar = (o2b) obj2;
            k47 k47VarA = o2bVar.a();
            if (pa7.t(k47VarA != null ? (String) k47VarA.b : null, googlePay.b)) {
                if (o2bVar.b() != 1) {
                    if (o2bVar.b() == 2) {
                        ArrayList<String> arrayListD = o2bVar.d();
                        if (!arrayListD.isEmpty()) {
                            for (String str : arrayListD) {
                                str.getClass();
                                if (hj6.t(str) != null) {
                                }
                            }
                        }
                    }
                }
                arrayList3.add(obj2);
                break;
            }
        }
        if (arrayList3.isEmpty()) {
            if (arrayList2.isEmpty()) {
                d().e("No purchase.");
                l3aVar.a(d3aVar);
                return;
            } else {
                d().e("There's already a purchase, but not mine.");
                l3aVar.a(c3a.a);
                return;
            }
        }
        googlePay.d().e("There's already a purchase.");
        googlePay.d().e("Start checking query: " + arrayList3);
        ArrayList arrayList4 = new ArrayList();
        String str2 = googlePay.b;
        if (str2 != null) {
            Iterator it = StoreInAppPurchaseResultsKt.a(str2, arrayList3, false).iterator();
            while (it.hasNext()) {
                l3aVar.a((h3a) it.next());
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            o2b o2bVar2 = (o2b) it2.next();
            m8b m8bVarD = googlePay.d();
            String strC = o2bVar2.c();
            JSONObject jSONObject = o2bVar2.c;
            String strOptString = jSONObject.optString("orderId");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = null;
            }
            k47 k47VarA2 = o2bVar2.a();
            String str3 = k47VarA2 != null ? (String) k47VarA2.b : null;
            k47 k47VarA3 = o2bVar2.a();
            String str4 = k47VarA3 != null ? (String) k47VarA3.c : null;
            ArrayList arrayListD2 = o2bVar2.d();
            int iB = o2bVar2.b();
            l3a l3aVar2 = l3aVar;
            long jOptLong = jSONObject.optLong("purchaseTime");
            String strC2 = o2bVar2.c();
            String str5 = o2bVar2.b;
            Iterator it3 = it2;
            String strOptString2 = jSONObject.optString("developerPayload");
            ArrayList arrayList5 = arrayList4;
            String str6 = o2bVar2.a;
            boolean zOptBoolean = jSONObject.optBoolean("acknowledged", true);
            StringBuilder sbO = ib8.o("Purchase: ", strC, " ", strOptString, " ");
            ub3.v(sbO, str3, " ", str4, " ");
            sbO.append(arrayListD2);
            sbO.append(" ");
            sbO.append(iB);
            sbO.append(" ");
            sbO.append(jOptLong);
            sbO.append(" ");
            sbO.append(strC2);
            ub3.v(sbO, " ", str5, " ", strOptString2);
            sbO.append(" ");
            sbO.append(str6);
            sbO.append(" ");
            sbO.append(zOptBoolean);
            m8bVarD.e(sbO.toString());
            String strOptString3 = jSONObject.optString("orderId");
            if (TextUtils.isEmpty(strOptString3)) {
                strOptString3 = null;
            }
            String strC3 = o2bVar2.c();
            strC3.getClass();
            if (o2bVar2.b() == 1) {
                ArrayList arrayListD3 = o2bVar2.d();
                uzd uzdVar = u7e.a;
                Iterator it4 = arrayListD3.iterator();
                do {
                    if (!it4.hasNext()) {
                        u7eVar = null;
                        break;
                    }
                    String str7 = (String) it4.next();
                    uzdVar.getClass();
                    str7.getClass();
                    Iterator it5 = u7e.E0.iterator();
                    do {
                        if (!it5.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it5.next();
                    } while (!pa7.t(((u7e) next).b(), str7));
                    u7eVar = (u7e) next;
                } while (u7eVar == null);
                if (u7eVar != null) {
                    f7e f7eVar = new f7e(strC3, strOptString3, u7eVar);
                    arrayList = arrayList5;
                    arrayList.add(f7eVar);
                } else {
                    arrayList = arrayList5;
                }
            } else {
                arrayList = arrayList5;
            }
            it2 = it3;
            arrayList4 = arrayList;
            l3aVar = l3aVar2;
            googlePay = this;
        }
        l3a l3aVar3 = l3aVar;
        if (arrayList4.isEmpty()) {
            return;
        }
        l3aVar3.a(f3a.a);
    }

    public final wef f(bwa bwaVar, String str) {
        BillingSession billingSession;
        wef wefVar = wef.a;
        BillingSessionOwner billingSessionOwner = this.e;
        synchronized (billingSessionOwner.b) {
            billingSession = billingSessionOwner.d;
        }
        if (billingSession == null) {
            return wefVar;
        }
        vb2 vb2Var = this.a;
        ynb.V(vpf.H(vb2Var), null, null, new GooglePay$purchase$2$1(this, billingSession, vb2Var, str, bwaVar, null), 3);
        return wefVar;
    }

    public final void g(hwa hwaVar, BillingSession billingSession) {
        d().e("Start querying product details: " + hwaVar);
        c78 c78VarW = t72.w();
        int iOrdinal = hwaVar.ordinal();
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        if (iOrdinal == 0) {
            mx4 mx4Var = u7e.E0;
            HashSet hashSet = new HashSet();
            ArrayList<u7e> arrayList = new ArrayList();
            mx4Var.getClass();
            l2 l2Var = new l2(i2, mx4Var);
            while (l2Var.hasNext()) {
                Object next = l2Var.next();
                if (hashSet.add(((u7e) next).b())) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
            for (u7e u7eVar : arrayList) {
                String strB = u7eVar.b();
                w37 w37Var = new w37(i);
                w37Var.b = u7eVar.b();
                w37Var.c = "subs";
                arrayList2.add(new iy9(strB, w37Var.a()));
            }
            c78VarW.addAll(arrayList2);
        } else {
            if (iOrdinal != 1) {
                ap.c();
                return;
            }
            ArrayList arrayListQ0 = s72.Q0(s72.Q0(s72.Q0(s72.Q0(thb.x, az2.d), e56.w), hj.c), m86.d);
            lmd.a.getClass();
            ArrayList arrayListQ1 = s72.Q0(arrayListQ0, lmd.b);
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayListQ1.iterator();
            while (it.hasNext()) {
                x72.g0(arrayList3, ((p07) it.next()).c());
            }
            List<String> listJ1 = s72.j1(s72.n1(arrayList3));
            ArrayList arrayList4 = new ArrayList(t72.u(listJ1, 10));
            for (String str : listJ1) {
                w37 w37Var2 = new w37(i);
                w37Var2.b = str;
                w37Var2.c = "inapp";
                arrayList4.add(new iy9(str, w37Var2.a()));
            }
            c78VarW.addAll(arrayList4);
        }
        c78 c78VarN = c78VarW.n();
        oz5 oz5Var = new oz5(18);
        oz5 oz5Var2 = new oz5(19);
        jt3 jt3Var = new jt3(29, this, billingSession);
        o14 o14Var = new o14(28, this, billingSession);
        it3 it3Var = new it3(this, billingSession, hwaVar, 11);
        jc6 jc6Var = new jc6(this, billingSession, i3);
        jc6 jc6Var2 = new jc6(this, billingSession, i2);
        c78VarN.getClass();
        if (c78VarN.isEmpty()) {
            if (((Boolean) jt3Var.invoke()).booleanValue()) {
                it3Var.d(pu4.a);
            }
        } else {
            ProductDetailsBatchQueryKt.a(jt3Var, s72.p1(c78VarN, 20, 20, true), new AtomicBoolean(false), c78VarN, it3Var, new ArrayList(), o14Var, jc6Var2, oz5Var, oz5Var2, jc6Var, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [net.xmind.donut.gp.GooglePay$start$1] */
    public final void h(String str, hwa hwaVar) {
        ox0 fwgVar;
        iy9 iy9Var;
        str.getClass();
        this.b = str;
        this.c = hwaVar;
        AtomicReference atomicReference = new AtomicReference();
        vb2 vb2Var = this.a;
        nx0 nx0Var = new nx0(vb2Var);
        nx0Var.c = new bo1(13, atomicReference, this);
        nx0Var.b = new yx4(17);
        if (((bo1) nx0Var.c) == null) {
            qc0.j("Please provide a valid listener for purchases updates.");
            return;
        }
        if (((yx4) nx0Var.b) == null) {
            qc0.j("Pending purchases for one-time products must be supported.");
            return;
        }
        ((yx4) nx0Var.b).getClass();
        bo1 bo1Var = (bo1) nx0Var.c;
        yx4 yx4Var = (yx4) nx0Var.b;
        if (bo1Var != null) {
            bo1 bo1Var2 = (bo1) nx0Var.c;
            fwgVar = nx0Var.a() ? new fwg(yx4Var, vb2Var, bo1Var2, nx0Var) : new ox0(yx4Var, vb2Var, bo1Var2, nx0Var);
        } else {
            fwgVar = nx0Var.a() ? new fwg(yx4Var, vb2Var, nx0Var) : new ox0(yx4Var, vb2Var, nx0Var);
        }
        BillingSessionOwner billingSessionOwner = this.e;
        billingSessionOwner.getClass();
        synchronized (billingSessionOwner.b) {
            BillingSession billingSession = billingSessionOwner.d;
            long j = billingSessionOwner.c + 1;
            billingSessionOwner.c = j;
            BillingSession billingSession2 = new BillingSession(fwgVar, j);
            billingSessionOwner.d = billingSession2;
            iy9Var = new iy9(billingSession, billingSession2);
        }
        BillingSession billingSession3 = (BillingSession) iy9Var.a();
        final BillingSession billingSession4 = (BillingSession) iy9Var.b();
        if (billingSession3 != null) {
            try {
                BillingSessionOwnerKt$createBillingSessionOwner$1.a.d(billingSession3.a);
            } catch (Exception e) {
                billingSessionOwner.a.d(e);
            }
        }
        atomicReference.set(billingSession4);
        fwgVar.e(new px0() { // from class: net.xmind.donut.gp.GooglePay$start$1
            @Override // defpackage.px0
            public final void a(tx0 tx0Var) {
                tx0Var.getClass();
                int i = GooglePay.g;
                this.a.c(billingSession4, tx0Var);
            }

            @Override // defpackage.px0
            public final void b() {
                int i = GooglePay.g;
                GooglePay googlePay = this.a;
                if (googlePay.e.b(billingSession4)) {
                    googlePay.j("Billing service disconnected.");
                    googlePay.d.a(i3a.a);
                }
            }
        });
        d().e("Billing create.");
    }

    public final void i(BillingSession billingSession, Activity activity, sx0 sx0Var) {
        BillingSessionOwner billingSessionOwner = this.e;
        if (billingSessionOwner.b(billingSession)) {
            tx0 tx0VarB = billingSession.a.b(activity, sx0Var);
            tx0VarB.getClass();
            if (billingSessionOwner.b(billingSession)) {
                if (tx0VarB.a == 0) {
                    d().e("Billing flow launched.");
                    return;
                }
                d().b("Fail to launch billing: " + tx0VarB.a + ", " + tx0VarB.c);
                this.d.a(a3a.a);
            }
        }
    }

    public final void j(String str) {
        d().b(str);
        lw2.a(new GooglePay$toastError$1(this, str, null));
    }
}
