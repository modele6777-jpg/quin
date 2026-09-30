package defpackage;

import ai.askquin.data.SeasonalDraftStore$Draft;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vu5 extends g4 {
    public static final /* synthetic */ int b1 = 0;
    public final yic P0;
    public final t7 Q0;
    public final rw5 R0;
    public final ckc S0;
    public final mic T0;
    public final s0e U0;
    public final whb V0;
    public boolean W0;
    public boolean X0;
    public String Y0;
    public boolean Z0;
    public lyd a1;

    public vu5(yic yicVar, t7 t7Var, rw5 rw5Var, ckc ckcVar) {
        qs5 qs5VarA;
        h89 h89Var;
        super(t7Var, null);
        this.P0 = yicVar;
        this.Q0 = t7Var;
        this.R0 = rw5Var;
        this.S0 = ckcVar;
        mic micVarB = yicVar.b();
        this.T0 = micVarB;
        ax5 ax5Var = ax5.a;
        if (micVarB != null) {
            LocalDateTime localDateTime = xs5.a;
            qs5VarA = xs5.a(ax5Var, micVarB, false, 10);
        } else {
            qs5VarA = qs5.y;
        }
        s0e s0eVarA = t0e.a(new ju5(null, null, null, ax5Var, qs5VarA, true, true, false, false, false));
        this.U0 = s0eVarA;
        this.V0 = if9.n(s0eVarA);
        this.X0 = true;
        this.Y0 = "unknown";
        mic micVarB2 = yicVar.b();
        ok8.C(new kl5(if9.n((micVarB2 == null || (h89Var = (h89) rw5Var.d.get(micVarB2)) == null) ? rw5Var.e : h89Var), new ku5(this, null), 1), hwf.a(this));
    }

    @Override // defpackage.g4
    public final void C(Object obj) {
        ax5 ax5Var = (ax5) obj;
        if (ax5Var == null || ax5Var == ax5.a) {
            return;
        }
        O();
    }

    @Override // defpackage.g4
    public final void D(ArrayList arrayList) {
        u7e u7eVar;
        Object next;
        s0e s0eVar;
        Object value;
        mic micVar = this.T0;
        int i = micVar == null ? -1 : lu5.a[micVar.ordinal()];
        if (i != -1) {
            if (i == 1) {
                u7eVar = u7e.c;
            } else {
                if (i != 2) {
                    ap.c();
                    return;
                }
                u7eVar = u7e.d;
            }
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((z6e) next).h() != u7eVar);
            z6e z6eVar = (z6e) next;
            if (z6eVar == null) {
                d().g("Seasonal subscription not found in prices: " + u7eVar);
            }
            do {
                s0eVar = this.U0;
                value = s0eVar.getValue();
            } while (!s0eVar.l(value, ju5.a((ju5) value, null, null, z6eVar, null, null, false, false, false, false, 955)));
        }
    }

    @Override // defpackage.g4
    public final void E(String str) {
        yic yicVar;
        String strA;
        str.getClass();
        if (this.X0 && (strA = (yicVar = this.P0).a()) != null) {
            mic micVarB = yicVar.b();
            int i = micVarB == null ? -1 : lu5.a[micVarB.ordinal()];
            if (i != -1) {
                if (i != 1) {
                    if (i != 2) {
                        ap.c();
                        return;
                    } else if (!str.equals("member-quarter") && !str.equals("limited-quarterly")) {
                        return;
                    } else {
                        str = "limited-quarterly";
                    }
                }
                x1f x1fVar = x1f.a;
                x1f.k(new r05("subscribe_succeeded"), new it3(str, this, strA, 8), 2);
            }
        }
    }

    @Override // defpackage.g4
    public final void M(vb2 vb2Var) {
        Q(vb2Var, "unknown");
    }

    public final void O() {
        yic yicVar = this.P0;
        Long l = g3b.a;
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        LocalDateTime localDateTimeA = g3b.a(zoneIdSystemDefault);
        yicVar.getClass();
        if (jpc.b(yicVar, localDateTimeA) != null) {
            ynb.V(hwf.a(this), null, null, new mu5(this, null), 3);
        }
    }

    public final qs5 P(ax5 ax5Var) {
        mic micVar = this.T0;
        if (micVar == null) {
            return qs5.y;
        }
        LocalDateTime localDateTime = xs5.a;
        SeasonalDraftStore$Draft seasonalDraftStore$DraftB = this.S0.b(micVar.b(), micVar.c().getWireValue());
        boolean z = false;
        if (seasonalDraftStore$DraftB != null) {
            if (!seasonalDraftStore$DraftB.getVirtualChoices().isEmpty()) {
                z = true;
                break;
            }
            List<TarotCardChoice> physicalSlots = seasonalDraftStore$DraftB.getPhysicalSlots();
            if (physicalSlots == null || !physicalSlots.isEmpty()) {
                Iterator<T> it = physicalSlots.iterator();
                while (it.hasNext()) {
                    if (((TarotCardChoice) it.next()) != null) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return xs5.a(ax5Var, micVar, z, 2);
    }

    public final void Q(vb2 vb2Var, String str) {
        str.getClass();
        this.Y0 = str;
        this.X0 = !str.equals("qa");
        super.M(vb2Var);
        if (!this.Z0) {
            this.Z0 = true;
            hs3 hs3Var = xqa.V;
            isa isaVar = hs3Var.a;
            Object obj = hs3Var.b;
            ypa.a.getClass();
            ok8.C(new kl5(new ru5(ypa.b(), isaVar, obj), new su5(this, null), 1), hwf.a(this));
        }
        lyd lydVar = this.a1;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.a1 = ynb.V(hwf.a(this), null, null, new uu5(vb2Var, this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // defpackage.g4
    public final Object i(zn2 zn2Var) {
        nu5 nu5Var;
        Object value;
        Object value2;
        Object value3;
        if (zn2Var instanceof nu5) {
            nu5Var = (nu5) zn2Var;
            int i = nu5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nu5Var.label = i - Integer.MIN_VALUE;
            } else {
                nu5Var = new nu5(this, zn2Var);
            }
        } else {
            nu5Var = new nu5(this, zn2Var);
        }
        Object objR = nu5Var.result;
        int i2 = nu5Var.label;
        s0e s0eVar = this.U0;
        try {
            if (i2 == 0) {
                jzb.q(objR);
                rw5 rw5Var = this.R0;
                yic yicVar = this.P0;
                String str = this.Y0;
                nu5Var.label = 1;
                rw5Var.getClass();
                objR = pa7.t(str, "auto_open") ? rs0.R(15000L, new nw5(rw5Var, yicVar, null), nu5Var) : rw5Var.b(yicVar, nu5Var);
                bw2 bw2Var = bw2.a;
                if (objR == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objR);
            }
            do {
                value3 = s0eVar.getValue();
            } while (!s0eVar.l(value3, ju5.a((ju5) value3, null, null, null, null, null, false, false, false, false, 255)));
            return (ax5) objR;
        } catch (kye unused) {
            do {
                value2 = s0eVar.getValue();
            } while (!s0eVar.l(value2, ju5.a((ju5) value2, null, null, null, null, null, false, false, false, true, 511)));
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            d().h("Failed to load seasonal intro status", e2);
            do {
                value = s0eVar.getValue();
            } while (!s0eVar.l(value, ju5.a((ju5) value, null, null, null, null, null, false, false, false, true, 511)));
            return null;
        }
    }

    @Override // defpackage.g4
    public final String l() {
        if (this.T0 != mic.AutumnEquinox2026) {
            return null;
        }
        ca2.a.getClass();
        if (ca2.c) {
            return null;
        }
        return "seasonal-reading-intro";
    }

    @Override // defpackage.g4
    public final String m() {
        String strA = this.P0.a();
        if (this.X0) {
            return strA;
        }
        return null;
    }

    @Override // defpackage.g4
    public final boolean r(Object obj) {
        ax5 ax5Var = (ax5) obj;
        ax5Var.getClass();
        return ax5Var != ax5.a;
    }

    @Override // defpackage.g4
    public final boolean s(Object obj) {
        ax5 ax5Var = (ax5) obj;
        ax5Var.getClass();
        return ax5Var != ax5.a;
    }

    @Override // defpackage.g4
    public final void u(Object obj, List list) {
        ax5 ax5Var = (ax5) obj;
        ca2.a.getClass();
        cmc cmcVarL = rs0.L(this.T0, ca2.c);
        if (cmcVarL == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p07 p07Var = ((o07) it.next()).e;
            if (p07Var == cmcVarL.a || p07Var == cmcVarL.b) {
                if (ax5Var == null || ax5Var == ax5.a) {
                    return;
                }
                O();
                return;
            }
        }
    }

    @Override // defpackage.g4
    public final void v() {
        this.W0 = false;
    }

    @Override // defpackage.g4
    public final void w(ArrayList arrayList) {
        Object obj;
        Object next;
        s0e s0eVar;
        Object value;
        ca2.a.getClass();
        cmc cmcVarL = rs0.L(this.T0, ca2.c);
        if (cmcVarL == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((n07) next).g() != cmcVarL.a);
        n07 n07Var = (n07) next;
        for (Object obj2 : arrayList) {
            if (((n07) obj2).g() == cmcVarL.b) {
                obj = obj2;
                break;
            }
        }
        n07 n07Var2 = (n07) obj;
        do {
            s0eVar = this.U0;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, ju5.a((ju5) value, n07Var, n07Var2, null, null, null, false, false, false, false, 988)));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    @Override // defpackage.g4
    public final void x(String str, List list) {
        String strA;
        Object obj;
        str.getClass();
        if (this.X0) {
            e56 e56Var = e56.SUMMER_SOLSTICE_READING_2026;
            String str2 = "seasonalReading";
            if (!str.equals(e56Var.b())) {
                e56 e56Var2 = e56.AUTUMN_EQUINOX_READING_2026;
                if (!str.equals(e56Var2.b()) && !str.equals("seasonal-reading")) {
                    e56 e56Var3 = e56.SUMMER_SOLSTICE_READING_2026_EARLY_BIRD;
                    if (str.equals(e56Var3.b())) {
                        str2 = "seasonalReading_earlyBird";
                    } else {
                        e56 e56Var4 = e56.AUTUMN_EQUINOX_READING_2026_EARLY_BIRD;
                        if (str.equals(e56Var4.b()) || str.equals("seasonal-reading-early-bird")) {
                            str2 = "seasonalReading_earlyBird";
                        } else {
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                p07 p07Var = ((o07) it.next()).e;
                                if (p07Var == e56Var || p07Var == e56Var2) {
                                    obj = "seasonalReading";
                                } else {
                                    obj = (p07Var == e56Var3 || p07Var == e56Var4) ? "seasonalReading_earlyBird" : null;
                                }
                                if (obj != null) {
                                    arrayList.add(obj);
                                }
                            }
                            str2 = (String) s72.Z0(s72.j1(s72.n1(arrayList)));
                        }
                    }
                }
            }
            if (str2 == null || (strA = this.P0.a()) == null) {
                return;
            }
            x1f x1fVar = x1f.a;
            x1f.k(new r05("purchase_succeeded"), new z53(str2, strA, 3), 2);
        }
    }

    @Override // defpackage.g4
    public final void y() {
        s0e s0eVar;
        Object value;
        do {
            s0eVar = this.U0;
            value = s0eVar.getValue();
        } while (!s0eVar.l(value, ju5.a((ju5) value, null, null, null, null, null, true, true, false, false, 792)));
    }

    @Override // defpackage.g4
    public final void z() {
        s0e s0eVar;
        Object value;
        ju5 ju5VarA;
        d().b("onPricesUpdateFailed");
        do {
            s0eVar = this.U0;
            value = s0eVar.getValue();
            ju5VarA = (ju5) value;
            if (l() != null) {
                ju5VarA = ju5.a(ju5VarA, null, null, null, null, null, false, false, false, false, 1016);
            }
        } while (!s0eVar.l(value, ju5.a(ju5VarA, null, null, null, null, null, false, false, true, false, 799)));
    }
}
