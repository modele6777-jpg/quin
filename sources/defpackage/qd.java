package defpackage;

import ai.askquin.qa.bridge.QaResult;
import ai.askquin.qa.capabilities.seasonal.SeasonalQaFixtureState;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qd implements d3b {
    public final u79 a;

    public qd(u79 u79Var) {
        this.a = u79Var;
    }

    public static ti7 e(String str, boolean z) {
        return f(str, !z, oh7.a(Boolean.valueOf(z)), z ? "开" : "关");
    }

    public static ti7 f(String str, boolean z, nh7 nh7Var, String str2) {
        return new ti7(bm8.H(new iy9("name", oh7.c(str)), new iy9("isDefault", oh7.a(Boolean.valueOf(z))), new iy9("value", nh7Var), new iy9("display", oh7.c(str2))));
    }

    public static ti7 g(String str, boolean z, nh7 nh7Var, String str2) {
        boolean z2 = !z;
        if (!z) {
            str2 = "—";
        } else if (str2 == null) {
            str2 = "启用";
        }
        return f(str, z2, nh7Var, str2);
    }

    public static ti7 h(int i, String str) {
        String str2;
        boolean z = i == -1;
        yi7 yi7VarB = oh7.b(Integer.valueOf(i));
        if (i != -1) {
            str2 = i != 1 ? "隐藏" : "显示";
        } else {
            str2 = "—";
        }
        return f(str, z, yi7VarB, str2);
    }

    @Override // defpackage.d3b
    public final dm1 a() {
        return dm1.a;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        nh7 ti7Var2;
        nh7 nh7VarC;
        c78 c78VarW = t72.w();
        c78VarW.add(e("account.skip-bind-phone", ((Boolean) kh3.a.getValue()).booleanValue()));
        c78VarW.add(e("debug.card-wheel-tap-overlay", ((Boolean) kh3.b.getValue()).booleanValue()));
        boolean z = jd9.a;
        c78VarW.add(e("env.net-sim.offline", jd9.a));
        long j = jd9.b;
        c78VarW.add(g("env.net-sim.slow", j > 0, oh7.b(Long.valueOf(j)), j > 0 ? j + "ms" : null));
        ConcurrentHashMap concurrentHashMap = jd9.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bm8.F(concurrentHashMap.size()));
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            linkedHashMap.put(entry.getKey(), Integer.valueOf(((fd9) entry.getValue()).a));
        }
        boolean z2 = !linkedHashMap.isEmpty();
        if (linkedHashMap.isEmpty()) {
            ti7Var2 = qi7.INSTANCE;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(bm8.F(linkedHashMap.size()));
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), oh7.b((Number) entry2.getValue()));
            }
            ti7Var2 = new ti7(linkedHashMap2);
        }
        c78VarW.add(g("env.net-sim.fail", z2, ti7Var2, !linkedHashMap.isEmpty() ? s72.D0(linkedHashMap.entrySet(), null, null, null, new z4(9), 31) : null));
        boolean z3 = this.a.b.a.getValue() != null;
        c78VarW.add(g("clock.set", z3, oh7.b(Long.valueOf(this.a.b())), z3 ? e3b.a(this.a).toString() : null));
        SeasonalQaFixtureState seasonalQaFixtureStateP = v2c.p();
        boolean z4 = seasonalQaFixtureStateP != null;
        if (seasonalQaFixtureStateP == null || (nh7VarC = oh7.c(seasonalQaFixtureStateP.getFixture())) == null) {
            nh7VarC = qi7.INSTANCE;
        }
        c78VarW.add(g("seasonal.fixture.set", z4, nh7VarC, seasonalQaFixtureStateP != null ? seasonalQaFixtureStateP.getFixture() + " · " + seasonalQaFixtureStateP.getStatus() + " · " + seasonalQaFixtureStateP.getResultScenario() : null));
        hs3 hs3Var = xqa.w0;
        ld ldVar = new ld(hs3Var.a, hs3Var.b, null);
        nu4 nu4Var = nu4.a;
        String str = (String) z5c.I(nu4Var, ldVar);
        boolean z5 = str.length() > 0;
        nh7 nh7VarC2 = str.length() == 0 ? qi7.INSTANCE : oh7.c(str);
        if (str.length() == 0) {
            str = null;
        }
        c78VarW.add(g("paywall.set-ab-group", z5, nh7VarC2, str));
        hs3 hs3Var2 = xqa.Y;
        String str2 = (String) z5c.I(nu4Var, new md(hs3Var2.a, hs3Var2.b, null));
        c78VarW.add(g("event.set-events-info", str2.length() > 0, str2.length() == 0 ? qi7.INSTANCE : oh7.c(str2), str2.length() > 0 ? "启用" : null));
        hs3 hs3Var3 = xqa.u;
        c78VarW.add(e("flag.set-annual-fortune", ((Boolean) z5c.I(nu4Var, new x10(hs3Var3.a, hs3Var3.b, null))).booleanValue()));
        hs3 hs3Var4 = xqa.w;
        c78VarW.add(h(((Number) z5c.I(nu4Var, new nd(hs3Var4.a, hs3Var4.b, null))).intValue(), "home.set-event-banner-visible"));
        hs3 hs3Var5 = xqa.x;
        c78VarW.add(h(((Number) z5c.I(nu4Var, new od(hs3Var5.a, hs3Var5.b, null))).intValue(), "home.set-four-seasons-visible"));
        hs3 hs3Var6 = xqa.U;
        String str3 = (String) z5c.I(nu4Var, new pd(hs3Var6.a, hs3Var6.b, null));
        c78VarW.add(g("flag.set-custom-domain", str3.length() > 0, str3.length() == 0 ? qi7.INSTANCE : oh7.c(str3), str3.length() != 0 ? str3 : null));
        return new QaResult.Ok(new ti7(bm8.G(new iy9("switches", new yg7(c78VarW.n())))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "qa.active-switches";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "聚合当前所有调试开关状态（只读，原始态/非原始态）";
    }
}
