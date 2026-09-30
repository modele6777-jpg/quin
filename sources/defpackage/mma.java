package defpackage;

import ai.askquin.ui.paywall.upgrade.FiveCardUpgradePending;
import ai.askquin.ui.paywall.upgrade.s;
import ai.askquin.ui.popup.dailyfortune.v;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.credits.GuestPassGrantPlan;
import tech.chatmind.api.credits.GuestPassGrantReason;
import tech.chatmind.api.credits.GuestPassPendingGrant;
import tech.chatmind.api.credits.LevelAndKind;
import tech.chatmind.api.credits.QuinSubscription;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.SubscriptionInfo;
import tech.chatmind.api.credits.SubscriptionKind;
import tech.chatmind.api.events.model.PopupAction;
import tech.chatmind.api.events.model.UserPopupEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mma extends ewf implements hf8 {
    public static final ZoneId u1;
    public static final ZonedDateTime v1;
    public static final ZonedDateTime w1;
    public final s E0;
    public final s0e F0;
    public final s0e G0;
    public final s0e H0;
    public final whb I0;
    public final s0e J0;
    public final whb K0;
    public final s0e L0;
    public final whb M0;
    public final s0e N0;
    public final whb O0;
    public final s0e P0;
    public final whb Q0;
    public boolean R0;
    public final Object S0;
    public long T0;
    public lyd U0;
    public boolean V0;
    public boolean W0;
    public final sf6 X;
    public String X0;
    public final p06 Y;
    public jr5 Y0;
    public final m06 Z;
    public boolean Z0;
    public boolean a1;
    public final gd8 b;
    public boolean b1;
    public final q9b c;
    public final s0e c1;
    public final fab d;
    public final whb d1;
    public final kj9 e;
    public FiveCardUpgradePending e1;
    public final v f;
    public boolean f1;
    public final k86 g;
    public Boolean g1;
    public pu3 h1;
    public String i1;
    public long j1;
    public UserPopupEvent k1;
    public String l1;
    public anf m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public boolean r1;
    public h06 s1;
    public final LinkedHashSet t1;
    public final t7 v;
    public final ht6 w;
    public final unf x;
    public final inf y;
    public final tnf z;

    static {
        ZoneId zoneIdOf = ZoneId.of("Asia/Shanghai");
        zoneIdOf.getClass();
        u1 = zoneIdOf;
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(2026, 5, 1, 0, 0, 0, 0, zoneIdOf);
        zonedDateTimeOf.getClass();
        v1 = zonedDateTimeOf;
        ZonedDateTime zonedDateTimeOf2 = ZonedDateTime.of(2026, 5, 5, 23, 59, 0, 0, zoneIdOf);
        zonedDateTimeOf2.getClass();
        w1 = zonedDateTimeOf2;
    }

    public mma(gd8 gd8Var, q9b q9bVar, fab fabVar, kj9 kj9Var, v vVar, k86 k86Var, t7 t7Var, ht6 ht6Var, unf unfVar, inf infVar, tnf tnfVar, sf6 sf6Var, p06 p06Var, m06 m06Var, s sVar) {
        this.b = gd8Var;
        this.c = q9bVar;
        this.d = fabVar;
        this.e = kj9Var;
        this.f = vVar;
        this.g = k86Var;
        this.v = t7Var;
        this.w = ht6Var;
        this.x = unfVar;
        this.y = infVar;
        this.z = tnfVar;
        this.X = sf6Var;
        this.Y = p06Var;
        this.Z = m06Var;
        this.E0 = sVar;
        s0e s0eVarA = t0e.a(null);
        this.F0 = s0eVarA;
        this.G0 = s0eVarA;
        Boolean bool = Boolean.FALSE;
        s0e s0eVarA2 = t0e.a(bool);
        this.H0 = s0eVarA2;
        this.I0 = if9.n(s0eVarA2);
        s0e s0eVarA3 = t0e.a(bool);
        this.J0 = s0eVarA3;
        this.K0 = if9.n(s0eVarA3);
        s0e s0eVarA4 = t0e.a(bool);
        this.L0 = s0eVarA4;
        this.M0 = if9.n(s0eVarA4);
        s0e s0eVarA5 = t0e.a(0L);
        this.N0 = s0eVarA5;
        this.O0 = if9.n(s0eVarA5);
        s0e s0eVarA6 = t0e.a(bool);
        this.P0 = s0eVarA6;
        this.Q0 = if9.n(s0eVarA6);
        this.S0 = new Object();
        this.Y0 = jr5.a;
        s0e s0eVarA7 = t0e.a(bool);
        this.c1 = s0eVarA7;
        this.d1 = if9.n(s0eVarA7);
        this.t1 = new LinkedHashSet();
        ynb.V(hwf.a(this), null, null, new mla(this, null), 3);
    }

    public static /* synthetic */ dg7 m(mma mmaVar, boolean z, int i) {
        return mmaVar.l(z, (i & 2) == 0, true);
    }

    public static boolean y(UserPopupEvent userPopupEvent) {
        Instant instantNow = Instant.now();
        return !userPopupEvent.getStartAt().toInstant().isAfter(instantNow) && userPopupEvent.getEndAt().toInstant().isAfter(instantNow);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(GuestPassPendingGrant guestPassPendingGrant, zn2 zn2Var) throws Throwable {
        xla xlaVar;
        GuestPassPendingGrant guestPassPendingGrant2;
        String str;
        if (zn2Var instanceof xla) {
            xlaVar = (xla) zn2Var;
            int i = xlaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                xlaVar.label = i - Integer.MIN_VALUE;
            } else {
                xlaVar = new xla(this, zn2Var);
            }
        } else {
            xlaVar = new xla(this, zn2Var);
        }
        Object obj = xlaVar.result;
        int i2 = xlaVar.label;
        t7 t7Var = this.v;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                String strD = jrb.d(t7Var);
                if (strD != null) {
                    p06 p06Var = this.Y;
                    xlaVar.L$0 = guestPassPendingGrant;
                    xlaVar.L$1 = strD;
                    xlaVar.label = 1;
                    Object objA = p06Var.a(xlaVar);
                    bw2 bw2Var = bw2.a;
                    if (objA == bw2Var) {
                        return bw2Var;
                    }
                    guestPassPendingGrant2 = guestPassPendingGrant;
                    str = strD;
                    obj = objA;
                }
                return null;
            }
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str2 = (String) xlaVar.L$1;
            GuestPassPendingGrant guestPassPendingGrant3 = (GuestPassPendingGrant) xlaVar.L$0;
            jzb.q(obj);
            str = str2;
            guestPassPendingGrant2 = guestPassPendingGrant3;
            l06 l06Var = (l06) obj;
            if (pa7.t(jrb.d(t7Var), str)) {
                return new pua(str, guestPassPendingGrant2, l06Var.e, l06Var.f, (String) null, 48);
            }
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            d().c("Friend-coupon grant popup blocked: coupon info unavailable", e2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B(zn2 zn2Var) throws Throwable {
        yla ylaVar;
        if (zn2Var instanceof yla) {
            ylaVar = (yla) zn2Var;
            int i = ylaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ylaVar.label = i - Integer.MIN_VALUE;
            } else {
                ylaVar = new yla(this, zn2Var);
            }
        } else {
            ylaVar = new yla(this, zn2Var);
        }
        Object objE = ylaVar.result;
        int i2 = ylaVar.label;
        try {
            if (i2 == 0) {
                jzb.q(objE);
                sf6 sf6Var = this.X;
                ylaVar.label = 1;
                objE = ((wqa) sf6Var).e(ylaVar);
                bw2 bw2Var = bw2.a;
                if (objE == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objE);
            }
            return (GuestPassPendingGrant) objE;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            d().c("Failed to load pending friend-coupon grant", e2);
            return null;
        }
    }

    public final void C() {
        GuestPassPendingGrant guestPassPendingGrant;
        h06 h06Var;
        Object value = this.F0.getValue();
        pua puaVar = value instanceof pua ? (pua) value : null;
        if (puaVar == null || (guestPassPendingGrant = puaVar.b) == null || (h06Var = this.s1) == null) {
            return;
        }
        if (!pa7.t(h06Var.a, guestPassPendingGrant)) {
            h06Var = null;
        }
        if (h06Var != null) {
            h06Var.c = true;
            if (h06Var.d) {
                this.s1 = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(zn2 zn2Var) {
        ama amaVar;
        if (zn2Var instanceof ama) {
            amaVar = (ama) zn2Var;
            int i = amaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                amaVar.label = i - Integer.MIN_VALUE;
            } else {
                amaVar = new ama(this, zn2Var);
            }
        } else {
            amaVar = new ama(this, zn2Var);
        }
        Object obj = amaVar.result;
        int i2 = amaVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            js3 js3Var = ga4.a;
            hr3 hr3Var = hr3.c;
            bma bmaVar = new bma(this, null);
            amaVar.label = 1;
            Object objP0 = ynb.p0(hr3Var, bmaVar, amaVar);
            bw2 bw2Var = bw2.a;
            if (objP0 == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        G();
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018d A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:80:0x0135, B:82:0x0143, B:85:0x0148, B:87:0x0150, B:90:0x0156, B:92:0x0170, B:93:0x0177, B:95:0x017d, B:101:0x018f, B:103:0x0199, B:96:0x0180, B:98:0x0188, B:100:0x018d, B:104:0x019d, B:105:0x01a2), top: B:112:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0199 A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:80:0x0135, B:82:0x0143, B:85:0x0148, B:87:0x0150, B:90:0x0156, B:92:0x0170, B:93:0x0177, B:95:0x017d, B:101:0x018f, B:103:0x0199, B:96:0x0180, B:98:0x0188, B:100:0x018d, B:104:0x019d, B:105:0x01a2), top: B:112:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x019d A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:80:0x0135, B:82:0x0143, B:85:0x0148, B:87:0x0150, B:90:0x0156, B:92:0x0170, B:93:0x0177, B:95:0x017d, B:101:0x018f, B:103:0x0199, B:96:0x0180, B:98:0x0188, B:100:0x018d, B:104:0x019d, B:105:0x01a2), top: B:112:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00fe A[Catch: all -> 0x008c, TryCatch #1 {all -> 0x008c, blocks: (B:30:0x0073, B:32:0x0077, B:34:0x007f, B:36:0x0088, B:39:0x0090, B:41:0x009d, B:42:0x00a0, B:44:0x00b0, B:47:0x00b6, B:49:0x00be, B:50:0x00cd, B:52:0x00d1, B:54:0x00d5, B:56:0x00db, B:57:0x00dd, B:58:0x00e1, B:60:0x00e5, B:62:0x00ed, B:66:0x00f6, B:67:0x00fa, B:69:0x00fe, B:73:0x0107, B:76:0x0110), top: B:113:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0104  */
    /* JADX WARN: Code duplicated, block: B:87:0x0150 A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:80:0x0135, B:82:0x0143, B:85:0x0148, B:87:0x0150, B:90:0x0156, B:92:0x0170, B:93:0x0177, B:95:0x017d, B:101:0x018f, B:103:0x0199, B:96:0x0180, B:98:0x0188, B:100:0x018d, B:104:0x019d, B:105:0x01a2), top: B:112:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0170 A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:80:0x0135, B:82:0x0143, B:85:0x0148, B:87:0x0150, B:90:0x0156, B:92:0x0170, B:93:0x0177, B:95:0x017d, B:101:0x018f, B:103:0x0199, B:96:0x0180, B:98:0x0188, B:100:0x018d, B:104:0x019d, B:105:0x01a2), top: B:112:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0177 A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:80:0x0135, B:82:0x0143, B:85:0x0148, B:87:0x0150, B:90:0x0156, B:92:0x0170, B:93:0x0177, B:95:0x017d, B:101:0x018f, B:103:0x0199, B:96:0x0180, B:98:0x0188, B:100:0x018d, B:104:0x019d, B:105:0x01a2), top: B:112:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x017d A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:80:0x0135, B:82:0x0143, B:85:0x0148, B:87:0x0150, B:90:0x0156, B:92:0x0170, B:93:0x0177, B:95:0x017d, B:101:0x018f, B:103:0x0199, B:96:0x0180, B:98:0x0188, B:100:0x018d, B:104:0x019d, B:105:0x01a2), top: B:112:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0180 A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:80:0x0135, B:82:0x0143, B:85:0x0148, B:87:0x0150, B:90:0x0156, B:92:0x0170, B:93:0x0177, B:95:0x017d, B:101:0x018f, B:103:0x0199, B:96:0x0180, B:98:0x0188, B:100:0x018d, B:104:0x019d, B:105:0x01a2), top: B:112:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0188 A[Catch: all -> 0x0153, TryCatch #0 {all -> 0x0153, blocks: (B:80:0x0135, B:82:0x0143, B:85:0x0148, B:87:0x0150, B:90:0x0156, B:92:0x0170, B:93:0x0177, B:95:0x017d, B:101:0x018f, B:103:0x0199, B:96:0x0180, B:98:0x0188, B:100:0x018d, B:104:0x019d, B:105:0x01a2), top: B:112:0x0135 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x018b A[DONT_INVERT] */
    public final void E(Boolean bool) {
        pu3 pu3Var;
        mma mmaVar;
        Boolean bool2;
        jr5 jr5Var;
        f();
        N();
        String strD = jrb.d(this.v);
        ca2.a.getClass();
        String str = !ca2.c ? strD : null;
        Object obj = this.S0;
        if (str != null) {
            synchronized (obj) {
                try {
                    String str2 = this.i1;
                    if (str2 != null && (!str2.equals(str))) {
                        this.j1++;
                        pu3 pu3Var2 = this.h1;
                        if (pu3Var2 != null) {
                            pu3Var2.h(null);
                        }
                        this.h1 = null;
                        this.i1 = null;
                        this.T0++;
                        lyd lydVar = this.U0;
                        if (lydVar != null) {
                            lydVar.h(null);
                        }
                        this.U0 = null;
                        this.V0 = false;
                        this.Z0 = false;
                        Object value = this.F0.getValue();
                        wua wuaVar = value instanceof wua ? (wua) value : null;
                        if (wuaVar != null && !pa7.t(wuaVar.a, str)) {
                            this.F0.m(null);
                            s0e s0eVar = this.H0;
                            Boolean bool3 = Boolean.FALSE;
                            s0eVar.getClass();
                            s0eVar.n(null, bool3);
                        }
                        anf anfVar = this.m1;
                        if (!pa7.t(anfVar != null ? anfVar.a : null, str)) {
                            this.m1 = null;
                        }
                        this.k1 = null;
                        this.l1 = null;
                    }
                    UserPopupEvent userPopupEvent = this.k1;
                    if (userPopupEvent == null) {
                        pu3Var = this.h1;
                        if (pu3Var != null) {
                            if ((pu3Var.b() ? pu3Var : null) != null || !pa7.t(this.i1, str)) {
                            }
                        }
                        long j = this.j1 + 1;
                        this.j1 = j;
                        this.i1 = str;
                        a62 a62VarA = hwf.a(this);
                        js3 js3Var = ga4.a;
                        mmaVar = this;
                        pu3 pu3VarX = ynb.x(a62VarA, hr3.c, dw2.b, new hma(mmaVar, str, j, null));
                        pu3VarX.start();
                        mmaVar.h1 = pu3VarX;
                    } else if (!pa7.t(this.l1, str) || !y(userPopupEvent)) {
                        this.k1 = null;
                        this.l1 = null;
                        pu3Var = this.h1;
                        if (pu3Var != null) {
                            if ((pu3Var.b() ? pu3Var : null) != null) {
                            }
                        }
                        long j2 = this.j1 + 1;
                        this.j1 = j2;
                        this.i1 = str;
                        a62 a62VarA2 = hwf.a(this);
                        js3 js3Var2 = ga4.a;
                        mmaVar = this;
                        pu3 pu3VarX2 = ynb.x(a62VarA2, hr3.c, dw2.b, new hma(mmaVar, str, j2, null));
                        pu3VarX2.start();
                        mmaVar.h1 = pu3VarX2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            synchronized (mmaVar.S0) {
                try {
                    if (!((Boolean) mmaVar.c1.getValue()).booleanValue() && !mmaVar.f1) {
                        bool2 = Boolean.TRUE;
                        if (pa7.t(bool, bool2)) {
                            mmaVar.g1 = bool2;
                        }
                        mmaVar.n1 = false;
                        mmaVar.M();
                        mmaVar.S();
                        mmaVar.a1 = false;
                        mmaVar.b1 = false;
                        if (((Boolean) mmaVar.P0.getValue()).booleanValue()) {
                            mmaVar.Y0 = jr5.a;
                            mmaVar.Z0 = false;
                        } else {
                            if (pa7.t(bool, bool2)) {
                                jr5Var = jr5.c;
                            } else if (pa7.t(bool, Boolean.FALSE)) {
                                jr5Var = jr5.a;
                            } else {
                                if (bool == null) {
                                    throw new rf9();
                                }
                                jr5Var = jr5.b;
                            }
                            mmaVar.Y0 = jr5Var;
                            mmaVar.Z0 = false;
                            if (pa7.t(bool, bool2)) {
                                mmaVar.q();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        synchronized (obj) {
            try {
                this.j1++;
                pu3 pu3Var3 = this.h1;
                if (pu3Var3 != null) {
                    pu3Var3.h(null);
                }
                this.h1 = null;
                this.i1 = null;
                if (!this.W0 || strD == null) {
                    this.T0++;
                    lyd lydVar2 = this.U0;
                    if (lydVar2 != null) {
                        lydVar2.h(null);
                    }
                    this.U0 = null;
                    this.V0 = false;
                    this.Z0 = false;
                }
                if (this.F0.getValue() instanceof wua) {
                    this.F0.m(null);
                    s0e s0eVar2 = this.H0;
                    Boolean bool4 = Boolean.FALSE;
                    s0eVar2.getClass();
                    s0eVar2.n(null, bool4);
                }
                this.m1 = null;
                this.k1 = null;
                this.l1 = null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        mmaVar = this;
        synchronized (mmaVar.S0) {
            if (!((Boolean) mmaVar.c1.getValue()).booleanValue()) {
                bool2 = Boolean.TRUE;
                if (pa7.t(bool, bool2)) {
                    mmaVar.g1 = bool2;
                }
                mmaVar.n1 = false;
                mmaVar.M();
                mmaVar.S();
                mmaVar.a1 = false;
                mmaVar.b1 = false;
                if (((Boolean) mmaVar.P0.getValue()).booleanValue()) {
                    mmaVar.Y0 = jr5.a;
                    mmaVar.Z0 = false;
                } else {
                    if (pa7.t(bool, bool2)) {
                        jr5Var = jr5.c;
                    } else if (pa7.t(bool, Boolean.FALSE)) {
                        jr5Var = jr5.a;
                    } else {
                        if (bool == null) {
                            throw new rf9();
                        }
                        jr5Var = jr5.b;
                    }
                    mmaVar.Y0 = jr5Var;
                    mmaVar.Z0 = false;
                    if (pa7.t(bool, bool2)) {
                        mmaVar.q();
                    }
                }
            }
        }
    }

    public final void F() {
        synchronized (this.S0) {
            if (!pa7.t(this.g1, Boolean.FALSE) || ((Boolean) this.c1.getValue()).booleanValue()) {
                s(this.T0);
            }
        }
    }

    public final void G() {
        synchronized (this.S0) {
            try {
                if (pa7.t(this.F0.getValue(), qua.a) || (this.F0.getValue() instanceof wua) || (this.F0.getValue() instanceof pua)) {
                    this.b1 = this.F0.getValue() instanceof wua;
                    this.Y0 = jr5.a;
                    this.Z0 = false;
                    this.a1 = true;
                }
                if (this.F0.getValue() instanceof wua) {
                    this.m1 = null;
                }
                C();
                this.T0++;
                lyd lydVar = this.U0;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                this.U0 = null;
                this.V0 = false;
                this.F0.m(null);
                this.n1 = true;
                S();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void H(FiveCardUpgradePending fiveCardUpgradePending) {
        fiveCardUpgradePending.getClass();
        synchronized (this.S0) {
            try {
                this.e1 = fiveCardUpgradePending;
                s0e s0eVar = this.c1;
                Boolean bool = Boolean.TRUE;
                s0eVar.getClass();
                s0eVar.n(null, bool);
                this.f1 = false;
                this.a1 = true;
                this.T0++;
                lyd lydVar = this.U0;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                this.U0 = null;
                this.F0.m(null);
                s0e s0eVar2 = this.H0;
                Boolean bool2 = Boolean.FALSE;
                s0eVar2.getClass();
                s0eVar2.n(null, bool2);
                this.n1 = false;
                M();
                S();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bc A[Catch: all -> 0x00c6, TRY_LEAVE, TryCatch #0 {, blocks: (B:33:0x00b6, B:35:0x00bc), top: B:89:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00db  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:55:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x011c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0131 A[Catch: all -> 0x0147, TryCatch #1 {, blocks: (B:63:0x012b, B:65:0x0131, B:67:0x0139, B:69:0x0141), top: B:91:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0149  */
    /* JADX WARN: Code duplicated, block: B:77:0x014f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:89:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Object I(zn2 zn2Var) {
        gma gmaVar;
        m5f m5fVar;
        String str;
        long jLongValue;
        String str2;
        long j;
        String str3;
        mnf lnfVar;
        iy9 iy9Var;
        UserPopupEvent userPopupEvent;
        String str4;
        Object objX;
        UserPopupEvent userPopupEvent2;
        long j2;
        mnf mnfVar;
        String str5;
        boolean z;
        if (zn2Var instanceof gma) {
            gmaVar = (gma) zn2Var;
            int i = gmaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gmaVar.label = i - Integer.MIN_VALUE;
            } else {
                gmaVar = new gma(this, zn2Var);
            }
        } else {
            gmaVar = new gma(this, zn2Var);
        }
        Object objH0 = gmaVar.result;
        Object obj = bw2.a;
        int i2 = gmaVar.label;
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 == 1) {
                j = gmaVar.J$0;
                str2 = (String) gmaVar.L$1;
                jzb.q(objH0);
            } else {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = gmaVar.J$0;
                str5 = (String) gmaVar.L$5;
                userPopupEvent2 = (UserPopupEvent) gmaVar.L$4;
                mnfVar = (mnf) gmaVar.L$2;
                str3 = (String) gmaVar.L$1;
                jzb.q(objH0);
            }
            if (((Boolean) objH0).booleanValue()) {
                return new xmf(str5, userPopupEvent2, true);
            }
            str4 = str5;
            lnfVar = mnfVar;
            userPopupEvent = userPopupEvent2;
            j = j2;
            synchronized (this.S0) {
                if (!w(j, str3) && pa7.t(this.k1, userPopupEvent) && pa7.t(this.l1, str4)) {
                    this.k1 = null;
                    this.l1 = null;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z && (lnfVar instanceof lnf)) {
                z2 = true;
            }
            return new xmf(null, null, z2);
        }
        jzb.q(objH0);
        synchronized (this.S0) {
            m5fVar = new m5f(this.h1, this.i1, new Long(this.j1));
        }
        nu3 nu3Var = (nu3) m5fVar.a();
        str = (String) m5fVar.b();
        jLongValue = ((Number) m5fVar.c()).longValue();
        if (nu3Var == null) {
            lnfVar = new lnf(pu4.a);
            str3 = str;
            j = jLongValue;
            synchronized (this.S0) {
                if (w(j, str3)) {
                    iy9Var = new iy9(this.k1, this.l1);
                } else {
                    iy9Var = null;
                }
            }
            if (iy9Var == null) {
                return new xmf(null, null, false);
            }
            userPopupEvent = (UserPopupEvent) iy9Var.d();
            if (userPopupEvent == null) {
                return new xmf(null, null, lnfVar instanceof lnf);
            }
            str4 = (String) iy9Var.e();
            if (str4 != null && pa7.t(jrb.d(this.v), str4)) {
                gmaVar.L$0 = null;
                gmaVar.L$1 = str3;
                gmaVar.L$2 = lnfVar;
                gmaVar.L$3 = null;
                gmaVar.L$4 = userPopupEvent;
                gmaVar.L$5 = str4;
                gmaVar.J$0 = j;
                gmaVar.label = 2;
                objX = x(str4, userPopupEvent, gmaVar);
                if (objX != obj) {
                    long j3 = j;
                    userPopupEvent2 = userPopupEvent;
                    j2 = j3;
                    mnfVar = lnfVar;
                    objH0 = objX;
                    str5 = str4;
                    if (((Boolean) objH0).booleanValue()) {
                        return new xmf(str5, userPopupEvent2, true);
                    }
                    str4 = str5;
                    lnfVar = mnfVar;
                    userPopupEvent = userPopupEvent2;
                    j = j2;
                }
            }
            synchronized (this.S0) {
                if (!w(j, str3)) {
                    z = false;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
                return new xmf(null, null, z2);
            }
        }
        gmaVar.L$0 = null;
        gmaVar.L$1 = str;
        gmaVar.J$0 = jLongValue;
        gmaVar.label = 1;
        objH0 = nu3Var.H0(gmaVar);
        if (objH0 != obj) {
            str2 = str;
            j = jLongValue;
        }
        return obj;
        lnfVar = (mnf) objH0;
        if (lnfVar == null) {
            jLongValue = j;
            str = str2;
            lnfVar = new lnf(pu4.a);
            str3 = str;
            j = jLongValue;
        } else {
            str3 = str2;
        }
        synchronized (this.S0) {
            if (w(j, str3)) {
                iy9Var = new iy9(this.k1, this.l1);
            } else {
                iy9Var = null;
            }
            if (iy9Var == null) {
                return new xmf(null, null, false);
            }
            userPopupEvent = (UserPopupEvent) iy9Var.d();
            if (userPopupEvent == null) {
                return new xmf(null, null, lnfVar instanceof lnf);
            }
            str4 = (String) iy9Var.e();
            if (str4 != null) {
                gmaVar.L$0 = null;
                gmaVar.L$1 = str3;
                gmaVar.L$2 = lnfVar;
                gmaVar.L$3 = null;
                gmaVar.L$4 = userPopupEvent;
                gmaVar.L$5 = str4;
                gmaVar.J$0 = j;
                gmaVar.label = 2;
                objX = x(str4, userPopupEvent, gmaVar);
                if (objX != obj) {
                    long j4 = j;
                    userPopupEvent2 = userPopupEvent;
                    j2 = j4;
                    mnfVar = lnfVar;
                    objH0 = objX;
                    str5 = str4;
                    if (((Boolean) objH0).booleanValue()) {
                        return new xmf(str5, userPopupEvent2, true);
                    }
                    str4 = str5;
                    lnfVar = mnfVar;
                    userPopupEvent = userPopupEvent2;
                    j = j2;
                }
                return obj;
            }
            synchronized (this.S0) {
                if (!w(j, str3)) {
                    z = false;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
                return new xmf(null, null, z2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0036 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x0003, B:6:0x0012, B:8:0x0018, B:10:0x0024, B:12:0x0028, B:17:0x0032, B:19:0x0036, B:21:0x003a, B:23:0x004b, B:25:0x004f, B:27:0x0064, B:29:0x0068, B:31:0x0079, B:35:0x0084, B:37:0x008c, B:38:0x0090, B:42:0x009c, B:44:0x00a8, B:47:0x00ae), top: B:53:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0084 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x0003, B:6:0x0012, B:8:0x0018, B:10:0x0024, B:12:0x0028, B:17:0x0032, B:19:0x0036, B:21:0x003a, B:23:0x004b, B:25:0x004f, B:27:0x0064, B:29:0x0068, B:31:0x0079, B:35:0x0084, B:37:0x008c, B:38:0x0090, B:42:0x009c, B:44:0x00a8, B:47:0x00ae), top: B:53:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:41:0x009b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a8 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x0003, B:6:0x0012, B:8:0x0018, B:10:0x0024, B:12:0x0028, B:17:0x0032, B:19:0x0036, B:21:0x003a, B:23:0x004b, B:25:0x004f, B:27:0x0064, B:29:0x0068, B:31:0x0079, B:35:0x0084, B:37:0x008c, B:38:0x0090, B:42:0x009c, B:44:0x00a8, B:47:0x00ae), top: B:53:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    public final boolean J(long j, yua yuaVar, boolean z) {
        boolean z2;
        boolean z3;
        synchronized (this.S0) {
            try {
                z2 = false;
                if (!((Boolean) this.P0.getValue()).booleanValue() && j == this.T0) {
                    if (pa7.t(this.g1, Boolean.FALSE)) {
                        pua puaVar = yuaVar instanceof pua ? (pua) yuaVar : null;
                        if (puaVar != null && puaVar.e) {
                            if (yuaVar instanceof wua) {
                                if (z) {
                                    this.Y0 = jr5.a;
                                }
                                this.F0.m(yuaVar);
                                s0e s0eVar = this.H0;
                                if (yuaVar == null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                Boolean boolValueOf = Boolean.valueOf(z3);
                                s0eVar.getClass();
                                s0eVar.n(null, boolValueOf);
                                if (yuaVar == null) {
                                    M();
                                }
                                this.n1 = yuaVar == null;
                                S();
                                z2 = true;
                            } else {
                                if (z) {
                                    this.Y0 = jr5.a;
                                }
                                this.F0.m(yuaVar);
                                s0e s0eVar2 = this.H0;
                                if (yuaVar == null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                Boolean boolValueOf2 = Boolean.valueOf(z3);
                                s0eVar2.getClass();
                                s0eVar2.n(null, boolValueOf2);
                                if (yuaVar == null) {
                                    M();
                                }
                                this.n1 = yuaVar == null;
                                S();
                                z2 = true;
                            }
                        }
                    } else if (((yuaVar instanceof wua) || pa7.t(jrb.d(this.v), ((wua) yuaVar).a)) && ((!(yuaVar instanceof vua) || pa7.t(jrb.d(this.v), ((vua) yuaVar).a.getAccountId())) && ((!(yuaVar instanceof pua) || pa7.t(jrb.d(this.v), ((pua) yuaVar).a)) && this.F0.getValue() == null))) {
                        if (z && !pa7.t(yuaVar, qua.a)) {
                            this.Y0 = jr5.a;
                        }
                        this.F0.m(yuaVar);
                        s0e s0eVar3 = this.H0;
                        if (yuaVar == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Boolean boolValueOf3 = Boolean.valueOf(z3);
                        s0eVar3.getClass();
                        s0eVar3.n(null, boolValueOf3);
                        if (yuaVar == null) {
                            M();
                        }
                        this.n1 = yuaVar == null;
                        S();
                        z2 = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r7 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K(defpackage.xn2 r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mma.K(xn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L(zn2 zn2Var) {
        jma jmaVar;
        if (zn2Var instanceof jma) {
            jmaVar = (jma) zn2Var;
            int i = jmaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jmaVar.label = i - Integer.MIN_VALUE;
            } else {
                jmaVar = new jma(this, zn2Var);
            }
        } else {
            jmaVar = new jma(this, zn2Var);
        }
        Object objB = jmaVar.result;
        int i2 = jmaVar.label;
        try {
            if (i2 == 0) {
                jzb.q(objB);
                fab fabVar = this.d;
                jmaVar.label = 1;
                objB = ((rab) fabVar).b(jmaVar);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objB);
            }
            if (((QuotaUsage) objB) == null) {
                d().b("Priority popup evaluation blocked: fresh quota unavailable");
            }
            return (QuotaUsage) objB;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            d().c("Priority popup evaluation blocked: quota refresh failed", e2);
            return null;
        }
    }

    public final void M() {
        this.o1 = false;
        this.p1 = false;
        this.q1 = false;
        this.r1 = false;
        s0e s0eVar = this.N0;
        s0eVar.n(null, Long.valueOf(((Number) s0eVar.getValue()).longValue() + 1));
    }

    public final boolean N() {
        boolean z;
        UserPopupEvent userPopupEvent;
        synchronized (this.S0) {
            try {
                Object value = this.F0.getValue();
                anf anfVar = null;
                wua wuaVar = value instanceof wua ? (wua) value : null;
                anf anfVar2 = (wuaVar == null || (userPopupEvent = wuaVar.b) == null) ? null : new anf(wuaVar.a, db6.N(userPopupEvent));
                z = true;
                boolean z2 = (wuaVar == null || pa7.t(this.m1, anfVar2)) ? false : true;
                if (wuaVar != null && z2) {
                    UserPopupEvent userPopupEvent2 = wuaVar.b;
                    this.k1 = userPopupEvent2;
                    this.l1 = wuaVar.a;
                    anf anfVar3 = this.m1;
                    if (pa7.t(anfVar3 != null ? anfVar3.b : null, db6.N(userPopupEvent2))) {
                        this.m1 = null;
                    }
                    this.F0.m(null);
                    s0e s0eVar = this.H0;
                    Boolean bool = Boolean.FALSE;
                    s0eVar.getClass();
                    s0eVar.n(null, bool);
                    this.T0++;
                    lyd lydVar = this.U0;
                    if (lydVar != null) {
                        lydVar.h(null);
                    }
                    this.U0 = null;
                    this.V0 = false;
                    this.Z0 = false;
                }
                UserPopupEvent userPopupEvent3 = this.k1;
                if (userPopupEvent3 != null) {
                    String strN = db6.N(userPopupEvent3);
                    String str = this.l1;
                    if (str != null) {
                        anfVar = new anf(str, strN);
                    }
                }
                boolean z3 = (this.k1 == null || pa7.t(this.m1, anfVar)) ? false : true;
                if (!z2 && !z3) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void O() {
        synchronized (this.S0) {
            if (this.R0) {
                return;
            }
            s0e s0eVar = this.P0;
            Boolean bool = Boolean.FALSE;
            s0eVar.getClass();
            s0eVar.n(null, bool);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007e -> B:23:0x0082). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object P(java.lang.String r8, java.util.List r9, defpackage.zn2 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.kma
            if (r0 == 0) goto L13
            r0 = r10
            kma r0 = (defpackage.kma) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kma r0 = new kma
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L42
            if (r1 != r3) goto L3c
            java.lang.Object r8 = r0.L$5
            tech.chatmind.api.events.model.UserPopupEvent r8 = (tech.chatmind.api.events.model.UserPopupEvent) r8
            java.lang.Object r9 = r0.L$4
            java.lang.Object r1 = r0.L$3
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r4 = r0.L$2
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Object r4 = r0.L$1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r4 = r0.L$0
            java.lang.String r4 = (java.lang.String) r4
            defpackage.jzb.q(r10)
            goto L82
        L3c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r2
        L42:
            defpackage.jzb.q(r10)
            java.util.Iterator r9 = r9.iterator()
            r1 = r9
        L4a:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto Lc5
            java.lang.Object r9 = r1.next()
            r10 = r9
            tech.chatmind.api.events.model.UserPopupEvent r10 = (tech.chatmind.api.events.model.UserPopupEvent) r10
            java.lang.String r4 = r10.getId()
            java.lang.String r5 = "popup_weekend-free-credit"
            boolean r4 = defpackage.pa7.t(r4, r5)
            if (r4 == 0) goto Lc1
            java.lang.String r4 = defpackage.db6.N(r10)
            r0.L$0 = r8
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r1
            r0.L$4 = r9
            r0.L$5 = r10
            r0.label = r3
            java.lang.Object r4 = r7.v(r8, r4, r0)
            bw2 r5 = defpackage.bw2.a
            if (r4 != r5) goto L7e
            return r5
        L7e:
            r6 = r4
            r4 = r8
            r8 = r10
            r10 = r6
        L82:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto Lc0
            boolean r10 = y(r8)
            if (r10 == 0) goto Lc0
            boolean r10 = defpackage.db6.Z(r8)
            if (r10 == 0) goto Lc0
            tech.chatmind.api.events.model.Popup r8 = r8.getPopup()
            java.util.List r8 = r8.getActions()
            if (r8 == 0) goto La7
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto La7
            goto Lc0
        La7:
            java.util.Iterator r8 = r8.iterator()
        Lab:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto Lc0
            java.lang.Object r10 = r8.next()
            tech.chatmind.api.events.model.PopupAction r10 = (tech.chatmind.api.events.model.PopupAction) r10
            boolean r10 = defpackage.db6.h0(r10)
            if (r10 == 0) goto Lab
            r10 = r3
            r8 = r4
            goto Lc2
        Lc0:
            r8 = r4
        Lc1:
            r10 = 0
        Lc2:
            if (r10 == 0) goto L4a
            return r9
        Lc5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mma.P(java.lang.String, java.util.List, zn2):java.lang.Object");
    }

    public final void Q(yua yuaVar) {
        synchronized (this.S0) {
            try {
                this.T0++;
                lyd lydVar = this.U0;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                this.U0 = null;
                this.V0 = false;
                C();
                s0e s0eVar = this.F0;
                s0eVar.getClass();
                s0eVar.n(null, yuaVar);
                s0e s0eVar2 = this.H0;
                Boolean bool = Boolean.FALSE;
                s0eVar2.getClass();
                s0eVar2.n(null, bool);
                this.n1 = false;
                S();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void R() {
        synchronized (this.S0) {
            try {
                this.T0++;
                lyd lydVar = this.U0;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                this.U0 = null;
                this.V0 = false;
                this.Y0 = jr5.a;
                this.Z0 = false;
                s0e s0eVar = this.P0;
                Boolean bool = Boolean.TRUE;
                s0eVar.getClass();
                s0eVar.n(null, bool);
                C();
                this.F0.m(null);
                s0e s0eVar2 = this.H0;
                Boolean bool2 = Boolean.FALSE;
                s0eVar2.getClass();
                s0eVar2.n(null, bool2);
                this.n1 = false;
                M();
                S();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void S() {
        Boolean boolValueOf = Boolean.valueOf(this.F0.getValue() != null || this.o1 || this.p1);
        s0e s0eVar = this.L0;
        s0eVar.getClass();
        s0eVar.n(null, boolValueOf);
        Boolean boolValueOf2 = Boolean.valueOf((!this.n1 || !(!((Boolean) this.H0.getValue()).booleanValue() || (this.q1 && this.r1)) || this.o1 || this.p1 || pa7.t(this.g1, Boolean.FALSE) || ((Boolean) this.P0.getValue()).booleanValue()) ? false : true);
        s0e s0eVar2 = this.J0;
        s0eVar2.getClass();
        s0eVar2.n(null, boolValueOf2);
    }

    public final void f() {
        synchronized (this.S0) {
            Object value = this.F0.getValue();
            pua puaVar = value instanceof pua ? (pua) value : null;
            if (puaVar == null) {
                return;
            }
            if (pa7.t(puaVar.a, jrb.d(this.v)) && ((mo3) this.v).b() && !((rab) this.d).e()) {
                return;
            }
            C();
            this.F0.m(null);
            s0e s0eVar = this.H0;
            Boolean bool = Boolean.FALSE;
            s0eVar.getClass();
            s0eVar.n(null, bool);
            this.X0 = null;
            this.T0++;
            lyd lydVar = this.U0;
            if (lydVar != null) {
                lydVar.h(null);
            }
            this.U0 = null;
            this.V0 = false;
            this.W0 = false;
            this.Z0 = false;
        }
    }

    public final void g(h06 h06Var, boolean z) {
        synchronized (this.S0) {
            if (this.s1 != h06Var) {
                return;
            }
            if (!z) {
                this.s1 = null;
                return;
            }
            h06Var.d = true;
            if (h06Var.c) {
                this.s1 = null;
            }
        }
    }

    public final void h() {
        s0e s0eVar = this.F0;
        if (s0eVar.getValue() instanceof nua) {
            s0eVar.m(null);
            this.n1 = true;
            S();
        }
    }

    public final void i(int i) {
        d83 d83Var = d83.b;
        if (i != 2 && i != 4) {
            d83Var = null;
        }
        Q(new tua(new mj9(i, d83Var)));
    }

    public final void k() {
        synchronized (this.S0) {
            if (this.R0) {
                this.R0 = false;
                s0e s0eVar = this.P0;
                Boolean bool = Boolean.FALSE;
                s0eVar.getClass();
                s0eVar.n(null, bool);
            }
        }
    }

    public final dg7 l(boolean z, boolean z2, boolean z3) {
        dg7 dg7Var;
        synchronized (this.S0) {
            if (((Boolean) this.P0.getValue()).booleanValue()) {
                fg7 fg7VarD = tq.d();
                fg7VarD.R(wef.a);
                dg7Var = fg7VarD;
            } else {
                this.n1 = false;
                M();
                S();
                lyd lydVar = this.U0;
                if (lydVar != null) {
                    if (!lydVar.b()) {
                        lydVar = null;
                    }
                    if (lydVar != null) {
                        if (this.W0) {
                            return lydVar;
                        }
                        if (!z2 && (this.V0 || !z)) {
                            return lydVar;
                        }
                        this.T0++;
                        lydVar.h(null);
                        this.U0 = null;
                    }
                }
                if (z2) {
                    C();
                    this.F0.m(null);
                    s0e s0eVar = this.H0;
                    Boolean bool = Boolean.FALSE;
                    s0eVar.getClass();
                    s0eVar.n(null, bool);
                }
                long j = 1 + this.T0;
                this.T0 = j;
                a62 a62VarA = hwf.a(this);
                js3 js3Var = ga4.a;
                lyd lydVarU = ynb.U(a62VarA, hr3.c, dw2.b, new pla(z2, this, j, z3, z, null));
                this.U0 = lydVarU;
                this.V0 = z;
                this.W0 = z2;
                lydVarU.start();
                dg7Var = lydVarU;
            }
            return dg7Var;
        }
    }

    public final void n() {
        synchronized (this.S0) {
            this.X0 = jrb.d(this.v);
            m(this, false, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(QuotaUsage quotaUsage, zn2 zn2Var) {
        qla qlaVar;
        SubscriptionInfo subscription;
        SubscriptionInfo subscription2;
        Instant instantExpiredAt;
        QuotaUsage quotaUsage2;
        long j;
        if (zn2Var instanceof qla) {
            qlaVar = (qla) zn2Var;
            int i = qlaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qlaVar.label = i - Integer.MIN_VALUE;
            } else {
                qlaVar = new qla(this, zn2Var);
            }
        } else {
            qlaVar = new qla(this, zn2Var);
        }
        Object objB = qlaVar.result;
        int i2 = qlaVar.label;
        if (i2 == 0) {
            jzb.q(objB);
            if (quotaUsage.getHasSubscription() && (((subscription = quotaUsage.getSubscription()) == null || !subscription.canPaymentTypeAutoRenewal()) && (subscription2 = quotaUsage.getSubscription()) != null && (instantExpiredAt = subscription2.expiredAt()) != null)) {
                long jBetween = ChronoUnit.DAYS.between(Instant.now(), instantExpiredAt);
                if (jBetween <= 3 && jBetween >= 0) {
                    wc8 wc8Var = this.b.d;
                    qlaVar.L$0 = quotaUsage;
                    qlaVar.J$0 = jBetween;
                    qlaVar.label = 1;
                    objB = tm7.B(wc8Var, qlaVar);
                    bw2 bw2Var = bw2.a;
                    if (objB == bw2Var) {
                        return bw2Var;
                    }
                    quotaUsage2 = quotaUsage;
                    j = jBetween;
                }
            }
            return null;
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = qlaVar.J$0;
        quotaUsage2 = (QuotaUsage) qlaVar.L$0;
        jzb.q(objB);
        ma8 ma8Var = ((lb8) objB).h;
        th5 th5Var = cye.b;
        if (!pa7.t(ma8Var, gcc.E(z57.a.a(), fbc.d()).a())) {
            int i3 = (int) j;
            QuinSubscription quinSubscriptionB = drb.b(quotaUsage2);
            if (quinSubscriptionB != null) {
                return new r55(i3, quinSubscriptionB);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0365  */
    /* JADX WARN: Code duplicated, block: B:104:0x036d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0399  */
    /* JADX WARN: Code duplicated, block: B:117:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:126:0x03da  */
    /* JADX WARN: Code duplicated, block: B:131:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:133:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:135:0x0400  */
    /* JADX WARN: Code duplicated, block: B:138:0x0419  */
    /* JADX WARN: Code duplicated, block: B:141:0x0420  */
    /* JADX WARN: Code duplicated, block: B:143:0x0423  */
    /* JADX WARN: Code duplicated, block: B:145:0x0429  */
    /* JADX WARN: Code duplicated, block: B:149:0x045c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0469  */
    /* JADX WARN: Code duplicated, block: B:156:0x0476  */
    /* JADX WARN: Code duplicated, block: B:159:0x0480  */
    /* JADX WARN: Code duplicated, block: B:15:0x009d A[PHI: r0 r2 r3 r4 r7 r11 r13 r14 r15
  0x009d: PHI (r0v136 java.lang.Object) = (r0v131 java.lang.Object), (r0v1 java.lang.Object) binds: [B:281:0x0729, B:14:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r2v72 int) = (r2v67 int), (r2v84 int) binds: [B:281:0x0729, B:14:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r3v46 int) = (r3v43 int), (r3v49 int) binds: [B:281:0x0729, B:14:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r4v47 boolean) = (r4v45 boolean), (r4v49 boolean) binds: [B:281:0x0729, B:14:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r7v61 boolean) = (r7v59 boolean), (r7v63 boolean) binds: [B:281:0x0729, B:14:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r11v39 long) = (r11v64 long), (r11v65 long) binds: [B:281:0x0729, B:14:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r13v33 tech.chatmind.api.credits.QuotaUsage) = (r13v30 tech.chatmind.api.credits.QuotaUsage), (r13v36 tech.chatmind.api.credits.QuotaUsage) binds: [B:281:0x0729, B:14:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r14v27 int) = (r14v21 int), (r14v34 int) binds: [B:281:0x0729, B:14:0x007a] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r15v19 xmf) = (r15v13 xmf), (r15v25 xmf) binds: [B:281:0x0729, B:14:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:162:0x048a  */
    /* JADX WARN: Code duplicated, block: B:164:0x048d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x048f  */
    /* JADX WARN: Code duplicated, block: B:169:0x04b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:174:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:175:0x04d4 A[DONT_INVERT, PHI: r0 r2 r3 r4 r7 r8 r11 r12
  0x04d4: PHI (r0v70 tech.chatmind.api.credits.QuotaUsage) = 
  (r0v50 tech.chatmind.api.credits.QuotaUsage)
  (r0v51 tech.chatmind.api.credits.QuotaUsage)
  (r0v69 tech.chatmind.api.credits.QuotaUsage)
  (r0v78 tech.chatmind.api.credits.QuotaUsage)
 binds: [B:163:0x048b, B:174:0x04d3, B:168:0x04ad, B:173:0x04d0] A[DONT_GENERATE, DONT_INLINE]
  0x04d4: PHI (r2v42 int) = (r2v27 int), (r2v27 int), (r2v40 int), (r2v43 int) binds: [B:163:0x048b, B:174:0x04d3, B:168:0x04ad, B:173:0x04d0] A[DONT_GENERATE, DONT_INLINE]
  0x04d4: PHI (r3v22 int) = (r3v9 int), (r3v9 int), (r3v20 int), (r3v23 int) binds: [B:163:0x048b, B:174:0x04d3, B:168:0x04ad, B:173:0x04d0] A[DONT_GENERATE, DONT_INLINE]
  0x04d4: PHI (r4v19 boolean) = (r4v11 boolean), (r4v11 boolean), (r4v17 boolean), (r4v20 boolean) binds: [B:163:0x048b, B:174:0x04d3, B:168:0x04ad, B:173:0x04d0] A[DONT_GENERATE, DONT_INLINE]
  0x04d4: PHI (r7v33 boolean) = (r7v23 boolean), (r7v23 boolean), (r7v31 boolean), (r7v34 boolean) binds: [B:163:0x048b, B:174:0x04d3, B:168:0x04ad, B:173:0x04d0] A[DONT_GENERATE, DONT_INLINE]
  0x04d4: PHI (r8v21 long) = (r8v17 long), (r8v17 long), (r8v19 long), (r8v22 long) binds: [B:163:0x048b, B:174:0x04d3, B:168:0x04ad, B:173:0x04d0] A[DONT_GENERATE, DONT_INLINE]
  0x04d4: PHI (r11v18 java.lang.String) = (r11v13 java.lang.String), (r11v13 java.lang.String), (r11v15 java.lang.String), (r11v19 java.lang.String) binds: [B:163:0x048b, B:174:0x04d3, B:168:0x04ad, B:173:0x04d0] A[DONT_GENERATE, DONT_INLINE]
  0x04d4: PHI (r12v8 xmf) = (r12v2 xmf), (r12v2 xmf), (r12v5 xmf), (r12v9 xmf) binds: [B:163:0x048b, B:174:0x04d3, B:168:0x04ad, B:173:0x04d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:176:0x04d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:180:0x04dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:198:0x052c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0104 A[PHI: r0 r2 r3 r4 r7 r11 r13 r14 r15
  0x0104: PHI (r0v115 java.lang.Object) = (r0v98 java.lang.Object), (r0v1 java.lang.Object) binds: [B:252:0x0650, B:18:0x00e3] A[DONT_GENERATE, DONT_INLINE]
  0x0104: PHI (r2v59 int) = (r2v49 int), (r2v62 int) binds: [B:252:0x0650, B:18:0x00e3] A[DONT_GENERATE, DONT_INLINE]
  0x0104: PHI (r3v39 int) = (r3v29 int), (r3v41 int) binds: [B:252:0x0650, B:18:0x00e3] A[DONT_GENERATE, DONT_INLINE]
  0x0104: PHI (r4v31 boolean) = (r4v25 boolean), (r4v34 boolean) binds: [B:252:0x0650, B:18:0x00e3] A[DONT_GENERATE, DONT_INLINE]
  0x0104: PHI (r7v55 boolean) = (r7v40 boolean), (r7v58 boolean) binds: [B:252:0x0650, B:18:0x00e3] A[DONT_GENERATE, DONT_INLINE]
  0x0104: PHI (r11v34 long) = (r11v68 long), (r11v69 long) binds: [B:252:0x0650, B:18:0x00e3] A[DONT_GENERATE, DONT_INLINE]
  0x0104: PHI (r13v27 tech.chatmind.api.credits.QuotaUsage) = (r13v21 tech.chatmind.api.credits.QuotaUsage), (r13v29 tech.chatmind.api.credits.QuotaUsage) binds: [B:252:0x0650, B:18:0x00e3] A[DONT_GENERATE, DONT_INLINE]
  0x0104: PHI (r14v16 java.lang.String) = (r14v9 java.lang.String), (r14v19 java.lang.String) binds: [B:252:0x0650, B:18:0x00e3] A[DONT_GENERATE, DONT_INLINE]
  0x0104: PHI (r15v10 xmf) = (r15v4 xmf), (r15v12 xmf) binds: [B:252:0x0650, B:18:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:201:0x0537  */
    /* JADX WARN: Code duplicated, block: B:203:0x053f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:208:0x054c  */
    /* JADX WARN: Code duplicated, block: B:210:0x054f  */
    /* JADX WARN: Code duplicated, block: B:212:0x0557  */
    /* JADX WARN: Code duplicated, block: B:218:0x058b A[PHI: r2 r3 r4 r7 r8 r11 r13 r14 r15
  0x058b: PHI (r2v47 int) = (r2v45 int), (r2v52 int) binds: [B:211:0x0555, B:216:0x0581] A[DONT_GENERATE, DONT_INLINE]
  0x058b: PHI (r3v27 int) = (r3v25 int), (r3v32 int) binds: [B:211:0x0555, B:216:0x0581] A[DONT_GENERATE, DONT_INLINE]
  0x058b: PHI (r4v24 boolean) = (r4v22 boolean), (r4v27 boolean) binds: [B:211:0x0555, B:216:0x0581] A[DONT_GENERATE, DONT_INLINE]
  0x058b: PHI (r7v38 boolean) = (r7v36 boolean), (r7v43 boolean) binds: [B:211:0x0555, B:216:0x0581] A[DONT_GENERATE, DONT_INLINE]
  0x058b: PHI (r8v31 tech.chatmind.api.credits.GuestPassPendingGrant) = (r8v27 tech.chatmind.api.credits.GuestPassPendingGrant), (r8v34 tech.chatmind.api.credits.GuestPassPendingGrant) binds: [B:211:0x0555, B:216:0x0581] A[DONT_GENERATE, DONT_INLINE]
  0x058b: PHI (r11v25 long) = (r11v73 long), (r11v74 long) binds: [B:211:0x0555, B:216:0x0581] A[DONT_GENERATE, DONT_INLINE]
  0x058b: PHI (r13v20 tech.chatmind.api.credits.QuotaUsage) = (r13v16 tech.chatmind.api.credits.QuotaUsage), (r13v23 tech.chatmind.api.credits.QuotaUsage) binds: [B:211:0x0555, B:216:0x0581] A[DONT_GENERATE, DONT_INLINE]
  0x058b: PHI (r14v8 java.lang.String) = (r14v2 java.lang.String), (r14v12 java.lang.String) binds: [B:211:0x0555, B:216:0x0581] A[DONT_GENERATE, DONT_INLINE]
  0x058b: PHI (r15v3 xmf) = (r15v1 xmf), (r15v6 xmf) binds: [B:211:0x0555, B:216:0x0581] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:221:0x0595  */
    /* JADX WARN: Code duplicated, block: B:223:0x0598  */
    /* JADX WARN: Code duplicated, block: B:226:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:229:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:231:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:233:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:236:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:237:0x05fc A[PHI: r2 r3 r4 r7 r11 r13 r14 r15
  0x05fc: PHI (r2v49 int) = (r2v45 int), (r2v45 int), (r2v51 int) binds: [B:200:0x0535, B:209:0x054d, B:236:0x05f7] A[DONT_GENERATE, DONT_INLINE]
  0x05fc: PHI (r3v29 int) = (r3v25 int), (r3v25 int), (r3v31 int) binds: [B:200:0x0535, B:209:0x054d, B:236:0x05f7] A[DONT_GENERATE, DONT_INLINE]
  0x05fc: PHI (r4v25 boolean) = (r4v22 boolean), (r4v22 boolean), (r4v26 boolean) binds: [B:200:0x0535, B:209:0x054d, B:236:0x05f7] A[DONT_GENERATE, DONT_INLINE]
  0x05fc: PHI (r7v40 boolean) = (r7v36 boolean), (r7v36 boolean), (r7v42 boolean) binds: [B:200:0x0535, B:209:0x054d, B:236:0x05f7] A[DONT_GENERATE, DONT_INLINE]
  0x05fc: PHI (r11v27 long) = (r11v22 long), (r11v22 long), (r11v29 long) binds: [B:200:0x0535, B:209:0x054d, B:236:0x05f7] A[DONT_GENERATE, DONT_INLINE]
  0x05fc: PHI (r13v21 tech.chatmind.api.credits.QuotaUsage) = 
  (r13v16 tech.chatmind.api.credits.QuotaUsage)
  (r13v16 tech.chatmind.api.credits.QuotaUsage)
  (r13v22 tech.chatmind.api.credits.QuotaUsage)
 binds: [B:200:0x0535, B:209:0x054d, B:236:0x05f7] A[DONT_GENERATE, DONT_INLINE]
  0x05fc: PHI (r14v9 java.lang.String) = (r14v2 java.lang.String), (r14v2 java.lang.String), (r14v11 java.lang.String) binds: [B:200:0x0535, B:209:0x054d, B:236:0x05f7] A[DONT_GENERATE, DONT_INLINE]
  0x05fc: PHI (r15v4 xmf) = (r15v1 xmf), (r15v1 xmf), (r15v5 xmf) binds: [B:200:0x0535, B:209:0x054d, B:236:0x05f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:238:0x05fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:248:0x0628  */
    /* JADX WARN: Code duplicated, block: B:249:0x062d  */
    /* JADX WARN: Code duplicated, block: B:251:0x0630  */
    /* JADX WARN: Code duplicated, block: B:256:0x065c  */
    /* JADX WARN: Code duplicated, block: B:268:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:273:0x06db A[PHI: r0 r2 r3 r4 r7 r11 r13 r14 r15
  0x06db: PHI (r0v128 java.lang.Object) = (r0v114 java.lang.Object), (r0v1 java.lang.Object) binds: [B:271:0x06d7, B:16:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x06db: PHI (r2v67 int) = (r2v58 int), (r2v71 int) binds: [B:271:0x06d7, B:16:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x06db: PHI (r3v43 int) = (r3v38 int), (r3v45 int) binds: [B:271:0x06d7, B:16:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x06db: PHI (r4v45 boolean) = (r4v30 boolean), (r4v46 boolean) binds: [B:271:0x06d7, B:16:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x06db: PHI (r7v59 boolean) = (r7v54 boolean), (r7v60 boolean) binds: [B:271:0x06d7, B:16:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x06db: PHI (r11v37 long) = (r11v66 long), (r11v67 long) binds: [B:271:0x06d7, B:16:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x06db: PHI (r13v30 tech.chatmind.api.credits.QuotaUsage) = (r13v26 tech.chatmind.api.credits.QuotaUsage), (r13v32 tech.chatmind.api.credits.QuotaUsage) binds: [B:271:0x06d7, B:16:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x06db: PHI (r14v21 int) = (r14v15 int), (r14v26 int) binds: [B:271:0x06d7, B:16:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x06db: PHI (r15v13 xmf) = (r15v9 xmf), (r15v18 xmf) binds: [B:271:0x06d7, B:16:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:275:0x06df  */
    /* JADX WARN: Code duplicated, block: B:277:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:280:0x070b  */
    /* JADX WARN: Code duplicated, block: B:285:0x0731  */
    /* JADX WARN: Code duplicated, block: B:287:0x073c  */
    /* JADX WARN: Code duplicated, block: B:28:0x01ea A[PHI: r0 r2 r3 r4 r7 r9
  0x01ea: PHI (r0v56 java.lang.Object) = (r0v45 java.lang.Object), (r0v1 java.lang.Object) binds: [B:127:0x03ed, B:27:0x01d5] A[DONT_GENERATE, DONT_INLINE]
  0x01ea: PHI (r2v34 boolean) = (r2v18 boolean), (r2v36 boolean) binds: [B:127:0x03ed, B:27:0x01d5] A[DONT_GENERATE, DONT_INLINE]
  0x01ea: PHI (r3v11 boolean) = (r3v5 boolean), (r3v16 boolean) binds: [B:127:0x03ed, B:27:0x01d5] A[DONT_GENERATE, DONT_INLINE]
  0x01ea: PHI (r4v12 xmf) = (r4v5 xmf), (r4v15 xmf) binds: [B:127:0x03ed, B:27:0x01d5] A[DONT_GENERATE, DONT_INLINE]
  0x01ea: PHI (r7v24 long) = (r7v68 long), (r7v69 long) binds: [B:127:0x03ed, B:27:0x01d5] A[DONT_GENERATE, DONT_INLINE]
  0x01ea: PHI (r9v23 tech.chatmind.api.credits.QuotaUsage) = (r9v21 tech.chatmind.api.credits.QuotaUsage), (r9v27 tech.chatmind.api.credits.QuotaUsage) binds: [B:127:0x03ed, B:27:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:290:0x075b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x075d  */
    /* JADX WARN: Code duplicated, block: B:292:0x0767  */
    /* JADX WARN: Code duplicated, block: B:294:0x076a  */
    /* JADX WARN: Code duplicated, block: B:295:0x076c  */
    /* JADX WARN: Code duplicated, block: B:301:0x0776  */
    /* JADX WARN: Code duplicated, block: B:303:0x079c A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:304:0x079f  */
    /* JADX WARN: Code duplicated, block: B:309:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:310:0x07da  */
    /* JADX WARN: Code duplicated, block: B:313:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:316:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:318:0x07f1  */
    /* JADX WARN: Code duplicated, block: B:321:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:322:0x07fe A[PHI: r3 r4 r7 r8 r9 r11 r14
  0x07fe: PHI (r3v50 int) = (r3v47 int), (r3v52 int) binds: [B:300:0x0774, B:321:0x07fd] A[DONT_GENERATE, DONT_INLINE]
  0x07fe: PHI (r4v50 int) = (r4v48 int), (r4v51 int) binds: [B:300:0x0774, B:321:0x07fd] A[DONT_GENERATE, DONT_INLINE]
  0x07fe: PHI (r7v64 boolean) = (r7v62 boolean), (r7v66 boolean) binds: [B:300:0x0774, B:321:0x07fd] A[DONT_GENERATE, DONT_INLINE]
  0x07fe: PHI (r8v48 boolean) = (r8v47 boolean), (r8v50 boolean) binds: [B:300:0x0774, B:321:0x07fd] A[DONT_GENERATE, DONT_INLINE]
  0x07fe: PHI (r9v44 tech.chatmind.api.credits.QuotaUsage) = (r9v42 tech.chatmind.api.credits.QuotaUsage), (r9v45 tech.chatmind.api.credits.QuotaUsage) binds: [B:300:0x0774, B:321:0x07fd] A[DONT_GENERATE, DONT_INLINE]
  0x07fe: PHI (r11v41 long) = (r11v39 long), (r11v58 long) binds: [B:300:0x0774, B:321:0x07fd] A[DONT_GENERATE, DONT_INLINE]
  0x07fe: PHI (r14v35 int) = (r14v28 int), (r14v36 int) binds: [B:300:0x0774, B:321:0x07fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:325:0x080d  */
    /* JADX WARN: Code duplicated, block: B:328:0x0827  */
    /* JADX WARN: Code duplicated, block: B:331:0x0836  */
    /* JADX WARN: Code duplicated, block: B:336:0x0845  */
    /* JADX WARN: Code duplicated, block: B:339:0x0850  */
    /* JADX WARN: Code duplicated, block: B:353:0x08a9  */
    /* JADX WARN: Code duplicated, block: B:355:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x028c  */
    /* JADX WARN: Code duplicated, block: B:72:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x02e0 A[Catch: Exception -> 0x0360, CancellationException -> 0x037f, TryCatch #0 {Exception -> 0x0360, blocks: (B:92:0x0334, B:94:0x0338, B:96:0x0343, B:99:0x0362, B:79:0x02f3, B:81:0x02f7, B:83:0x0301, B:85:0x030d, B:88:0x0318, B:102:0x0367, B:74:0x02d8, B:76:0x02e0, B:70:0x02be, B:67:0x02a7), top: B:362:0x02a7 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:79:0x02f3 A[Catch: Exception -> 0x0360, CancellationException -> 0x037f, PHI: r0 r2 r7 r8 r9
  0x02f3: PHI (r0v28 java.lang.Object) = (r0v27 java.lang.Object), (r0v1 java.lang.Object) binds: [B:77:0x02ef, B:37:0x022f] A[DONT_GENERATE, DONT_INLINE]
  0x02f3: PHI (r2v10 long) = (r2v97 long), (r2v12 long) binds: [B:77:0x02ef, B:37:0x022f] A[DONT_GENERATE, DONT_INLINE]
  0x02f3: PHI (r7v13 boolean) = (r7v10 boolean), (r7v15 boolean) binds: [B:77:0x02ef, B:37:0x022f] A[DONT_GENERATE, DONT_INLINE]
  0x02f3: PHI (r8v11 boolean) = (r8v9 boolean), (r8v12 boolean) binds: [B:77:0x02ef, B:37:0x022f] A[DONT_GENERATE, DONT_INLINE]
  0x02f3: PHI (r9v10 java.lang.String) = (r9v7 java.lang.String), (r9v14 java.lang.String) binds: [B:77:0x02ef, B:37:0x022f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0360, blocks: (B:92:0x0334, B:94:0x0338, B:96:0x0343, B:99:0x0362, B:79:0x02f3, B:81:0x02f7, B:83:0x0301, B:85:0x030d, B:88:0x0318, B:102:0x0367, B:74:0x02d8, B:76:0x02e0, B:70:0x02be, B:67:0x02a7), top: B:362:0x02a7 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x02f7 A[Catch: Exception -> 0x0360, CancellationException -> 0x037f, TryCatch #0 {Exception -> 0x0360, blocks: (B:92:0x0334, B:94:0x0338, B:96:0x0343, B:99:0x0362, B:79:0x02f3, B:81:0x02f7, B:83:0x0301, B:85:0x030d, B:88:0x0318, B:102:0x0367, B:74:0x02d8, B:76:0x02e0, B:70:0x02be, B:67:0x02a7), top: B:362:0x02a7 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x032d  */
    /* JADX WARN: Code duplicated, block: B:91:0x032f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0338 A[Catch: Exception -> 0x0360, CancellationException -> 0x037f, TryCatch #0 {Exception -> 0x0360, blocks: (B:92:0x0334, B:94:0x0338, B:96:0x0343, B:99:0x0362, B:79:0x02f3, B:81:0x02f7, B:83:0x0301, B:85:0x030d, B:88:0x0318, B:102:0x0367, B:74:0x02d8, B:76:0x02e0, B:70:0x02be, B:67:0x02a7), top: B:362:0x02a7 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0343 A[Catch: Exception -> 0x0360, CancellationException -> 0x037f, TryCatch #0 {Exception -> 0x0360, blocks: (B:92:0x0334, B:94:0x0338, B:96:0x0343, B:99:0x0362, B:79:0x02f3, B:81:0x02f7, B:83:0x0301, B:85:0x030d, B:88:0x0318, B:102:0x0367, B:74:0x02d8, B:76:0x02e0, B:70:0x02be, B:67:0x02a7), top: B:362:0x02a7 }] */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04a9, code lost:
    
        if (r0 == r6) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04cc, code lost:
    
        if (r0 == r6) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0577, code lost:
    
        if (r0 == r6) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0678, code lost:
    
        if (r0 == r6) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0875, code lost:
    
        if (r0 == r6) goto L344;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:145:0x0429, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:233:0x05ca, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:277:0x06ea, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:287:0x073c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:96:0x0343, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(long r19, boolean r21, defpackage.zn2 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mma.p(long, boolean, zn2):java.lang.Object");
    }

    public final dg7 q() {
        synchronized (this.S0) {
            if (((Boolean) this.P0.getValue()).booleanValue()) {
                fg7 fg7VarD = tq.d();
                fg7VarD.R(wef.a);
                return fg7VarD;
            }
            this.Y0 = jr5.a;
            this.Z0 = true;
            this.a1 = false;
            this.b1 = false;
            return m(this, true, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0134 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object r(long j, boolean z, zn2 zn2Var) throws Throwable {
        sla slaVar;
        String strD;
        long j2;
        GuestPassPendingGrant guestPassPendingGrant;
        Object objA;
        GuestPassPendingGrant guestPassPendingGrant2;
        String str;
        long j3;
        pua puaVar;
        boolean z2 = z;
        if (zn2Var instanceof sla) {
            slaVar = (sla) zn2Var;
            int i = slaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                slaVar.label = i - Integer.MIN_VALUE;
            } else {
                slaVar = new sla(this, zn2Var);
            }
        } else {
            slaVar = new sla(this, zn2Var);
        }
        Object objB = slaVar.result;
        int i2 = slaVar.label;
        t7 t7Var = this.v;
        wef wefVar = wef.a;
        Object obj = bw2.a;
        if (i2 == 0) {
            jzb.q(objB);
            strD = jrb.d(t7Var);
            if (strD != null) {
                if (z2) {
                    slaVar.L$0 = strD;
                    j2 = j;
                    slaVar.J$0 = j2;
                    slaVar.Z$0 = z2;
                    slaVar.label = 1;
                    if (L(slaVar) != obj) {
                    }
                    return obj;
                }
                j2 = j;
            }
            return wefVar;
        }
        if (i2 == 1) {
            z2 = slaVar.Z$0;
            j2 = slaVar.J$0;
            strD = (String) slaVar.L$0;
            jzb.q(objB);
        } else {
            if (i2 == 2) {
                z2 = slaVar.Z$0;
                long j4 = slaVar.J$0;
                strD = (String) slaVar.L$0;
                jzb.q(objB);
                j2 = j4;
                guestPassPendingGrant = (GuestPassPendingGrant) objB;
                if (guestPassPendingGrant != null || guestPassPendingGrant.getReason() != GuestPassGrantReason.Purchase) {
                    guestPassPendingGrant = null;
                }
                if (guestPassPendingGrant == null) {
                    slaVar.L$0 = null;
                    slaVar.L$1 = null;
                    slaVar.J$0 = j2;
                    slaVar.Z$0 = z2;
                    slaVar.label = 3;
                    if (p(j2, false, slaVar) == obj) {
                        return wefVar;
                    }
                } else {
                    slaVar.L$0 = strD;
                    slaVar.L$1 = guestPassPendingGrant;
                    slaVar.J$0 = j2;
                    slaVar.Z$0 = z2;
                    slaVar.label = 4;
                    objA = A(guestPassPendingGrant, slaVar);
                    if (objA != obj) {
                        GuestPassPendingGrant guestPassPendingGrant3 = guestPassPendingGrant;
                        objB = objA;
                        guestPassPendingGrant2 = guestPassPendingGrant3;
                        str = strD;
                        j3 = j2;
                    }
                }
                return obj;
            }
            if (i2 == 3) {
                jzb.q(objB);
                return wefVar;
            }
            if (i2 != 4) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j3 = slaVar.J$0;
            guestPassPendingGrant2 = (GuestPassPendingGrant) slaVar.L$1;
            str = (String) slaVar.L$0;
            jzb.q(objB);
        }
        puaVar = (pua) objB;
        if (puaVar != null) {
            String str2 = puaVar.a;
            GuestPassPendingGrant guestPassPendingGrant4 = puaVar.b;
            int i3 = puaVar.c;
            int i4 = puaVar.d;
            String str3 = puaVar.f;
            str2.getClass();
            guestPassPendingGrant4.getClass();
            yua puaVar2 = new pua(str2, guestPassPendingGrant4, i3, i4, true, str3);
            if (pa7.t(str, jrb.d(t7Var)) && J(j3, puaVar2, false)) {
                d().e("Priority popup: FriendCouponGrant (reason=" + guestPassPendingGrant2.getReason() + ", count=" + guestPassPendingGrant2.getCount() + ", afterPurchase=true)");
            }
        }
        return wefVar;
        slaVar.L$0 = strD;
        slaVar.J$0 = j2;
        slaVar.Z$0 = z2;
        slaVar.label = 2;
        objB = B(slaVar);
        if (objB != obj) {
            guestPassPendingGrant = (GuestPassPendingGrant) objB;
            if (guestPassPendingGrant != null) {
                guestPassPendingGrant = null;
            } else {
                guestPassPendingGrant = null;
            }
            if (guestPassPendingGrant == null) {
                slaVar.L$0 = null;
                slaVar.L$1 = null;
                slaVar.J$0 = j2;
                slaVar.Z$0 = z2;
                slaVar.label = 3;
                if (p(j2, false, slaVar) == obj) {
                    return wefVar;
                }
            } else {
                slaVar.L$0 = strD;
                slaVar.L$1 = guestPassPendingGrant;
                slaVar.J$0 = j2;
                slaVar.Z$0 = z2;
                slaVar.label = 4;
                objA = A(guestPassPendingGrant, slaVar);
                if (objA != obj) {
                    GuestPassPendingGrant guestPassPendingGrant5 = guestPassPendingGrant;
                    objB = objA;
                    guestPassPendingGrant2 = guestPassPendingGrant5;
                    str = strD;
                    j3 = j2;
                    puaVar = (pua) objB;
                    if (puaVar != null) {
                        String str4 = puaVar.a;
                        GuestPassPendingGrant guestPassPendingGrant6 = puaVar.b;
                        int i5 = puaVar.c;
                        int i6 = puaVar.d;
                        String str5 = puaVar.f;
                        str4.getClass();
                        guestPassPendingGrant6.getClass();
                        yua puaVar3 = new pua(str4, guestPassPendingGrant6, i5, i6, true, str5);
                        if (pa7.t(str, jrb.d(t7Var))) {
                            d().e("Priority popup: FriendCouponGrant (reason=" + guestPassPendingGrant2.getReason() + ", count=" + guestPassPendingGrant2.getCount() + ", afterPurchase=true)");
                        }
                    }
                    return wefVar;
                }
            }
        }
        return obj;
    }

    public final void s(long j) {
        synchronized (this.S0) {
            try {
                long j2 = this.T0;
                if (j != j2) {
                    return;
                }
                this.T0 = j2 + 1;
                lyd lydVar = this.U0;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                this.U0 = null;
                this.F0.m(null);
                s0e s0eVar = this.H0;
                Boolean bool = Boolean.FALSE;
                s0eVar.getClass();
                s0eVar.n(null, bool);
                this.a1 = true;
                this.n1 = false;
                S();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t() {
        s0e s0eVar = this.c1;
        if (((Boolean) s0eVar.getValue()).booleanValue() || this.f1) {
            this.e1 = null;
            Boolean bool = Boolean.FALSE;
            s0eVar.getClass();
            s0eVar.n(null, bool);
            this.f1 = false;
            this.a1 = true;
            s0e s0eVar2 = this.H0;
            s0eVar2.getClass();
            s0eVar2.n(null, bool);
            this.n1 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(String str, zn2 zn2Var) {
        ula ulaVar;
        boolean zContains;
        if (zn2Var instanceof ula) {
            ulaVar = (ula) zn2Var;
            int i = ulaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ulaVar.label = i - Integer.MIN_VALUE;
            } else {
                ulaVar = new ula(this, zn2Var);
            }
        } else {
            ulaVar = new ula(this, zn2Var);
        }
        Object objA = ulaVar.result;
        bw2 bw2Var = bw2.a;
        int i2 = ulaVar.label;
        boolean z = true;
        try {
            if (i2 == 0) {
                jzb.q(objA);
                if (str != null) {
                    synchronized (this.S0) {
                        zContains = this.t1.contains(str);
                    }
                    if (!zContains) {
                        m06 m06Var = this.Z;
                        ulaVar.L$0 = null;
                        ulaVar.label = 1;
                        objA = ((iqa) m06Var).a(str, ulaVar);
                        if (objA == bw2Var) {
                            return bw2Var;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objA);
            if (!((Boolean) objA).booleanValue()) {
                z = false;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            d().c("Failed to load friend-coupon notice exposure", e2);
        }
        return Boolean.valueOf(z);
    }

    public final Object v(String str, String str2, zn2 zn2Var) {
        boolean zT;
        synchronized (this.S0) {
            zT = pa7.t(this.m1, new anf(str, str2));
        }
        return !zT ? this.y.i(str, str2, zn2Var) : Boolean.TRUE;
    }

    public final boolean w(long j, String str) {
        if (this.j1 == j && pa7.t(this.i1, str)) {
            return str == null || pa7.t(jrb.d(this.v), str);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(String str, UserPopupEvent userPopupEvent, zn2 zn2Var) {
        vla vlaVar;
        List<PopupAction> actions;
        if (zn2Var instanceof vla) {
            vlaVar = (vla) zn2Var;
            int i = vlaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vlaVar.label = i - Integer.MIN_VALUE;
            } else {
                vlaVar = new vla(this, zn2Var);
            }
        } else {
            vlaVar = new vla(this, zn2Var);
        }
        Object objV = vlaVar.result;
        int i2 = vlaVar.label;
        boolean z = true;
        if (i2 == 0) {
            jzb.q(objV);
            if (pa7.t(userPopupEvent.getId(), "popup_weekend-free-credit")) {
                String strN = db6.N(userPopupEvent);
                vlaVar.L$0 = null;
                vlaVar.L$1 = userPopupEvent;
                vlaVar.label = 1;
                objV = v(str, strN, vlaVar);
                Object obj = bw2.a;
                if (objV == obj) {
                    return obj;
                }
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        userPopupEvent = (UserPopupEvent) vlaVar.L$1;
        jzb.q(objV);
        if (((Boolean) objV).booleanValue() || !y(userPopupEvent) || !db6.Z(userPopupEvent) || ((actions = userPopupEvent.getPopup().getActions()) != null && actions.isEmpty())) {
            z = false;
        } else {
            Iterator<T> it = actions.iterator();
            while (it.hasNext()) {
                if (db6.h0((PopupAction) it.next())) {
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object z(String str, QuotaUsage quotaUsage, zn2 zn2Var) throws Throwable {
        wla wlaVar;
        GuestPassGrantPlan guestPassGrantPlan;
        LevelAndKind levelAndKind;
        t7 t7Var = this.v;
        if (zn2Var instanceof wla) {
            wlaVar = (wla) zn2Var;
            int i = wlaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wlaVar.label = i - Integer.MIN_VALUE;
            } else {
                wlaVar = new wla(this, zn2Var);
            }
        } else {
            wlaVar = new wla(this, zn2Var);
        }
        Object objA = wlaVar.result;
        int i2 = wlaVar.label;
        try {
            if (i2 == 0) {
                jzb.q(objA);
                p06 p06Var = this.Y;
                wlaVar.L$0 = str;
                wlaVar.L$1 = quotaUsage;
                wlaVar.label = 1;
                objA = p06Var.a(wlaVar);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                quotaUsage = (QuotaUsage) wlaVar.L$1;
                str = (String) wlaVar.L$0;
                jzb.q(objA);
            }
            String str2 = str;
            l06 l06Var = (l06) objA;
            if (l06Var.c > 0 && pa7.t(jrb.d(t7Var), str2) && ((mo3) t7Var).b() && !((rab) this.d).e()) {
                QuinSubscription quinSubscriptionB = drb.b(quotaUsage);
                SubscriptionKind kind = (quinSubscriptionB == null || (levelAndKind = quinSubscriptionB.getLevelAndKind()) == null) ? null : levelAndKind.getKind();
                int i3 = kind == null ? -1 : nla.a[kind.ordinal()];
                if (i3 != 1) {
                    guestPassGrantPlan = i3 != 2 ? null : GuestPassGrantPlan.Year;
                } else {
                    guestPassGrantPlan = GuestPassGrantPlan.Month;
                }
                return new pua(str2, new GuestPassPendingGrant(l06Var.c, guestPassGrantPlan, GuestPassGrantReason.Backfill), l06Var.e, l06Var.f, str2, 16);
            }
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            d().c("Friend-coupon balance notice blocked: coupon info unavailable", e2);
            return null;
        }
    }
}
