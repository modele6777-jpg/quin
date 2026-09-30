package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.seasonal.SeasonalReadingRoute;
import tech.chatmind.api.seasonal.model.SeasonalHistoryItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bs0 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bs0(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        int i = this.a;
        int i2 = 1;
        wef wefVar = wef.a;
        Object obj2 = this.c;
        final boolean z = this.b;
        switch (i) {
            case 0:
                je2 je2Var = (je2) obj2;
                ((yr0) je2Var.a).f(z);
                ((xr0) je2Var.b).f(z);
                return new ds0((g58) obj, je2Var, 0);
            case 1:
                n69 n69Var = (n69) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                if (!z) {
                    qz9 qz9Var = (qz9) n69Var;
                    qz9Var.k(qz9Var.j() + fFloatValue);
                }
                return wefVar;
            case 2:
                xn1 xn1Var = (xn1) obj2;
                es esVar = (es) obj;
                esVar.getClass();
                pn1 pn1Var = new pn1(esVar, xn1Var);
                ym1 ym1Var = xn1Var.n;
                esVar.a.getFrameNumber();
                return Boolean.valueOf(io2.a(new co1(ym1Var, pn1Var), z));
            case 3:
                qy1 qy1Var = (qy1) obj2;
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                if (z) {
                    sn4.w0(sn4Var, qy1Var.c, ald.c(sn4Var.f()) / 2.0f, 0L, null, 124);
                }
                return wefVar;
            case 4:
                x16 x16Var = (x16) obj2;
                ste steVar = (ste) obj;
                steVar.getClass();
                if (z && (steVar.e() || steVar.d())) {
                    x16Var.invoke();
                }
                return wefVar;
            case 5:
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj2;
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a(z ? "playcard_switch_chart" : "playcard_switch_play", "btn");
                l1fVar.a(z ? "play_view" : "chart_view", "pathway");
                l1fVar.a(urg.r(tarotSkinIdentify), "deck_id");
                return wefVar;
            case 6:
                String str = (String) obj2;
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                x8c x8cVarW0 = q8cVar.W0("UPDATE divination SET hasFeedback = ? WHERE id = ?");
                try {
                    x8cVarW0.m(1, z ? 1L : 0L);
                    x8cVarW0.Q(2, str);
                    x8cVarW0.R0();
                    return wefVar;
                } finally {
                    x8cVarW0.close();
                }
            case 7:
                SeasonalHistoryItem seasonalHistoryItem = (SeasonalHistoryItem) obj;
                seasonalHistoryItem.getClass();
                ka9.e((ka9) obj2, new SeasonalReadingRoute(seasonalHistoryItem.getYear(), seasonalHistoryItem.getSolarTerm().getWireValue(), true, z), null, 6);
                return wefVar;
            case 8:
                x48 x48Var = (x48) obj2;
                ((ra4) obj).getClass();
                u48 u48Var = new u48() { // from class: in6
                    @Override // defpackage.u48
                    public final void h(x48 x48Var2, f48 f48Var) {
                        if (f48Var == f48.ON_RESUME && z) {
                            l93 l93Var = l93.a;
                            l93.a(l93.e, "Failed to deliver homepage page_view");
                        }
                    }
                };
                x48Var.k().a(u48Var);
                g48 g48Var = ((a58) x48Var.k()).i;
                g48Var.getClass();
                if (g48Var.compareTo(g48.e) >= 0 && z) {
                    l93 l93Var = l93.a;
                    l93.a(l93.e, "Failed to deliver homepage page_view");
                }
                return new oe0(16, x48Var, u48Var);
            case 9:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.a("next_step", "btn");
                l1fVar2.a("onboarding_birthday_select", "pathway");
                l1fVar2.a(((ma8) obj2).toString(), "birthday");
                l1fVar2.a(Boolean.valueOf(!z), "is_default");
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                af2 af2Var = (af2) obj2;
                af2Var.y(z);
                return new ds0((g58) obj, af2Var, 1);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                h0e h0eVar = (h0e) obj2;
                g0c g0cVar = (g0c) obj;
                g0cVar.getClass();
                g0cVar.g(false);
                float fFloatValue2 = z ? ((Number) h0eVar.getValue()).floatValue() : 1.0f;
                g0cVar.q(fFloatValue2);
                g0cVar.r(fFloatValue2);
                return wefVar;
            default:
                gpd gpdVar = (gpd) obj2;
                hxc hxcVar = (hxc) obj;
                if (!z) {
                    wn7[] wn7VarArr = exc.a;
                    hxcVar.c(cxc.j, wefVar);
                }
                String strValueOf = String.valueOf(ym8.L(gpdVar.c.j() * 100.0f) / 100.0f);
                wn7[] wn7VarArr2 = exc.a;
                gxc gxcVar = cxc.b;
                wn7 wn7Var = exc.a[0];
                gxcVar.getClass();
                hxcVar.c(gxcVar, strValueOf);
                hxcVar.c(swc.i, new f6(null, new xod(gpdVar, i2)));
                return wefVar;
        }
    }

    public /* synthetic */ bs0(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
