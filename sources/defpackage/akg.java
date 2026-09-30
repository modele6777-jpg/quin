package defpackage;

import android.util.Log;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class akg extends va9 {
    public final /* synthetic */ int g;
    public final /* synthetic */ fmg h;
    public final omg i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ akg(fmg fmgVar, String str, int i, omg omgVar, int i2) {
        super(str, i);
        this.g = i2;
        this.h = fmgVar;
        this.i = omgVar;
    }

    @Override // defpackage.va9
    public final int c() {
        int i = this.g;
        omg omgVar = this.i;
        switch (i) {
            case 0:
                return ((lyg) omgVar).s();
            default:
                return ((uyg) omgVar).s();
        }
    }

    @Override // defpackage.va9
    public final boolean d() {
        switch (this.g) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.va9
    public final boolean e() {
        switch (this.g) {
            case 0:
                return ((lyg) this.i).x();
            default:
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0279  */
    /* JADX WARN: Code duplicated, block: B:105:0x0299  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02de  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:131:0x030a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0310  */
    /* JADX WARN: Code duplicated, block: B:135:0x0324  */
    /* JADX WARN: Code duplicated, block: B:137:0x032a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0332  */
    /* JADX WARN: Code duplicated, block: B:141:0x033c  */
    /* JADX WARN: Code duplicated, block: B:150:0x035f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0368  */
    /* JADX WARN: Code duplicated, block: B:158:0x039f A[EDGE_INSN: B:158:0x039f->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:159:0x03b2 A[EDGE_INSN: B:159:0x03b2->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:199:0x0343 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac A[LOOP:1: B:59:0x0189->B:64:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207  */
    /* JADX WARN: Code duplicated, block: B:82:0x0210  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:91:0x024c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0260  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean i(Long l, Long l2, v2h v2hVar, long j, bsg bsgVar, boolean z) {
        HashSet hashSet;
        Iterator it;
        kd0 kd0Var;
        Iterator it2;
        Iterator it3;
        nyg nygVar;
        boolean z2;
        String strY;
        Object obj;
        Boolean boolH;
        Boolean boolH2;
        String str;
        qyg qygVarU;
        long j2;
        Boolean boolH3;
        e3h e3hVar;
        Long lValueOf;
        Double dValueOf;
        nyg nygVar2;
        Boolean boolH4;
        int i;
        hpg.a();
        fmg fmgVar = this.h;
        w3h w3hVar = (w3h) fmgVar.b;
        qqg qqgVar = w3hVar.d;
        w0h w0hVar = w3hVar.f;
        i0h i0hVar = w3hVar.x;
        azg azgVar = bzg.F0;
        String str2 = this.a;
        boolean zL0 = qqgVar.L0(str2, azgVar);
        lyg lygVar = (lyg) this.i;
        long j3 = lygVar.C() ? bsgVar.e : j;
        w3h.h(w0hVar);
        tz0 tz0Var = w0hVar.Z;
        tz0 tz0Var2 = w0hVar.x;
        boolean zIsLoggable = Log.isLoggable(w0hVar.G0(), 2);
        int i2 = this.b;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (zIsLoggable) {
            w3h.h(w0hVar);
            tz0Var.d("Evaluating filter. audience, filter, event", Integer.valueOf(i2), lygVar.r() ? Integer.valueOf(lygVar.s()) : null, i0hVar.a(lygVar.t()));
            w3h.h(w0hVar);
            lch lchVar = fmgVar.c.g;
            ich.S(lchVar);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (lygVar.r()) {
                i = 0;
                lch.V0(sb, 0, "filter_id", Integer.valueOf(lygVar.s()));
            } else {
                i = 0;
            }
            lch.V0(sb, i, "event_name", ((w3h) lchVar.b).x.a(lygVar.t()));
            String strR0 = lch.R0(lygVar.z(), lygVar.A(), lygVar.C());
            if (!strR0.isEmpty()) {
                lch.V0(sb, 0, "filter_type", strR0);
            }
            if (lygVar.x()) {
                lch.W0(sb, 1, "event_count_filter", lygVar.y());
            }
            if (lygVar.v() > 0) {
                sb.append("  filters {\n");
                Iterator it4 = lygVar.u().iterator();
                while (it4.hasNext()) {
                    lchVar.O0(sb, 2, (nyg) it4.next());
                }
            }
            lch.P0(1, sb);
            sb.append("}\n}\n");
            tz0Var.b(sb.toString(), "Filter definition");
        }
        if (!lygVar.r() || lygVar.s() > 256) {
            w3h.h(w0hVar);
            tz0Var2.c(w0h.E0(str2), String.valueOf(lygVar.r() ? Integer.valueOf(lygVar.s()) : null), "Invalid event filter ID. appId, id");
            return false;
        }
        boolean z3 = lygVar.z() || lygVar.A() || lygVar.C();
        if (z && !z3) {
            w3h.h(w0hVar);
            tz0Var.c(Integer.valueOf(i2), lygVar.r() ? Integer.valueOf(lygVar.s()) : null, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        String strW = v2hVar.w();
        if (!lygVar.x()) {
            hashSet = new HashSet();
            it = lygVar.u().iterator();
            while (true) {
                if (it.hasNext()) {
                    kd0Var = new kd0(0);
                    it2 = v2hVar.t().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = lygVar.u().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zL0 = zL0;
                                    w0hVar = w0hVar;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                nygVar = (nyg) it3.next();
                                if (nygVar.v()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                strY = nygVar.y();
                                if (strY.isEmpty()) {
                                    obj = kd0Var.get(strY);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                zL0 = zL0;
                                                w0hVar = w0hVar;
                                                if (obj == null) {
                                                    w3h.h(w0hVar);
                                                    tz0Var2.c(i0hVar.a(strW), i0hVar.b(strY), "Unknown param type. event, param");
                                                    break;
                                                }
                                                w3h.h(w0hVar);
                                                tz0Var.c(i0hVar.a(strW), i0hVar.b(strY), "Missing param for filter. event, param");
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (nygVar.r()) {
                                                if (nygVar.t()) {
                                                    zL0 = zL0;
                                                    w0hVar = w0hVar;
                                                    w3h.h(w0hVar);
                                                    tz0Var2.c(i0hVar.a(strW), i0hVar.b(strY), "No filter for String param. event, param");
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (lch.e1(str)) {
                                                    zL0 = zL0;
                                                    w0hVar = w0hVar;
                                                    w3h.h(w0hVar);
                                                    tz0Var2.c(i0hVar.a(strW), i0hVar.b(strY), "Invalid param value for number filter. event, param");
                                                    break;
                                                }
                                                qygVarU = nygVar.u();
                                                if (lch.e1(str)) {
                                                    zL0 = zL0;
                                                    w0hVar = w0hVar;
                                                    j2 = 0;
                                                    boolH3 = va9.h(new BigDecimal(str), qygVarU, 0.0d);
                                                } else {
                                                    boolH3 = null;
                                                }
                                                if (boolH3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolH3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                w0hVar = w0hVar;
                                                zL0 = zL0;
                                            } else {
                                                wyg wygVarS = nygVar.s();
                                                w3h.h(w0hVar);
                                                boolH3 = va9.g((String) obj, wygVarS, w0hVar);
                                            }
                                            j2 = 0;
                                            if (boolH3 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolH3.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            w0hVar = w0hVar;
                                            zL0 = zL0;
                                        } else if (nygVar.t()) {
                                            double dDoubleValue = ((Double) obj).doubleValue();
                                            boolH2 = va9.h(new BigDecimal(dDoubleValue), nygVar.u(), Math.ulp(dDoubleValue));
                                            if (boolH2 != null) {
                                                if (boolH2.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        } else {
                                            w3h.h(w0hVar);
                                            tz0Var2.c(i0hVar.a(strW), i0hVar.b(strY), "No number filter for double param. event, param");
                                        }
                                    } else if (nygVar.t()) {
                                        boolH = va9.h(new BigDecimal(((Long) obj).longValue()), nygVar.u(), 0.0d);
                                        if (boolH != null) {
                                            if (boolH.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    } else {
                                        w3h.h(w0hVar);
                                        tz0Var2.c(i0hVar.a(strW), i0hVar.b(strY), "No number filter for long param. event, param");
                                    }
                                } else {
                                    w3h.h(w0hVar);
                                    tz0Var2.b(i0hVar.a(strW), "Event has empty param name. event");
                                }
                            }
                        } else {
                            e3hVar = (e3h) it2.next();
                            if (!hashSet.contains(e3hVar.s())) {
                                if (e3hVar.v()) {
                                    String strS = e3hVar.s();
                                    if (e3hVar.v()) {
                                        lValueOf = Long.valueOf(e3hVar.w());
                                    } else {
                                        lValueOf = null;
                                    }
                                    kd0Var.put(strS, lValueOf);
                                } else if (e3hVar.z()) {
                                    String strS2 = e3hVar.s();
                                    if (e3hVar.z()) {
                                        dValueOf = Double.valueOf(e3hVar.A());
                                    } else {
                                        dValueOf = null;
                                    }
                                    kd0Var.put(strS2, dValueOf);
                                } else if (e3hVar.t()) {
                                    kd0Var.put(e3hVar.s(), e3hVar.u());
                                } else {
                                    w3h.h(w0hVar);
                                    tz0Var2.c(i0hVar.a(strW), i0hVar.b(e3hVar.s()), "Unknown value for param. event, param");
                                }
                            }
                        }
                    }
                } else {
                    nygVar2 = (nyg) it.next();
                    if (nygVar2.y().isEmpty()) {
                        w3h.h(w0hVar);
                        tz0Var2.b(i0hVar.a(strW), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(nygVar2.y());
                    }
                }
                zL0 = zL0;
                w0hVar = w0hVar;
                break;
            }
        }
        try {
            boolH4 = va9.h(new BigDecimal(j3), lygVar.y(), 0.0d);
        } catch (NumberFormatException unused) {
            boolH4 = null;
        }
        if (boolH4 != null) {
            if (boolH4.booleanValue()) {
                hashSet = new HashSet();
                it = lygVar.u().iterator();
                while (true) {
                    if (it.hasNext()) {
                        kd0Var = new kd0(0);
                        it2 = v2hVar.t().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = lygVar.u().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zL0 = zL0;
                                        w0hVar = w0hVar;
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    nygVar = (nyg) it3.next();
                                    if (nygVar.v() || !nygVar.w()) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    strY = nygVar.y();
                                    if (strY.isEmpty()) {
                                        obj = kd0Var.get(strY);
                                        if (obj instanceof Long) {
                                            if (obj instanceof Double) {
                                                if (obj instanceof String) {
                                                    zL0 = zL0;
                                                    w0hVar = w0hVar;
                                                    if (obj == null) {
                                                        w3h.h(w0hVar);
                                                        tz0Var2.c(i0hVar.a(strW), i0hVar.b(strY), "Unknown param type. event, param");
                                                        break;
                                                    }
                                                    w3h.h(w0hVar);
                                                    tz0Var.c(i0hVar.a(strW), i0hVar.b(strY), "Missing param for filter. event, param");
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                if (nygVar.r()) {
                                                    if (nygVar.t()) {
                                                        zL0 = zL0;
                                                        w0hVar = w0hVar;
                                                        w3h.h(w0hVar);
                                                        tz0Var2.c(i0hVar.a(strW), i0hVar.b(strY), "No filter for String param. event, param");
                                                        break;
                                                    }
                                                    str = (String) obj;
                                                    if (lch.e1(str)) {
                                                        zL0 = zL0;
                                                        w0hVar = w0hVar;
                                                        w3h.h(w0hVar);
                                                        tz0Var2.c(i0hVar.a(strW), i0hVar.b(strY), "Invalid param value for number filter. event, param");
                                                        break;
                                                    }
                                                    qygVarU = nygVar.u();
                                                    if (lch.e1(str)) {
                                                        boolH3 = null;
                                                    } else {
                                                        try {
                                                            zL0 = zL0;
                                                            w0hVar = w0hVar;
                                                            j2 = 0;
                                                            try {
                                                                boolH3 = va9.h(new BigDecimal(str), qygVarU, 0.0d);
                                                            } catch (NumberFormatException unused2) {
                                                                boolH3 = null;
                                                            }
                                                        } catch (NumberFormatException unused3) {
                                                            zL0 = zL0;
                                                            w0hVar = w0hVar;
                                                            j2 = 0;
                                                        }
                                                    }
                                                    if (boolH3 != null) {
                                                        break;
                                                    }
                                                    if (boolH3.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    w0hVar = w0hVar;
                                                    zL0 = zL0;
                                                } else {
                                                    wyg wygVarS2 = nygVar.s();
                                                    w3h.h(w0hVar);
                                                    boolH3 = va9.g((String) obj, wygVarS2, w0hVar);
                                                }
                                                j2 = 0;
                                                if (boolH3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolH3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                w0hVar = w0hVar;
                                                zL0 = zL0;
                                            } else if (nygVar.t()) {
                                                w3h.h(w0hVar);
                                                tz0Var2.c(i0hVar.a(strW), i0hVar.b(strY), "No number filter for double param. event, param");
                                            } else {
                                                double dDoubleValue2 = ((Double) obj).doubleValue();
                                                try {
                                                    boolH2 = va9.h(new BigDecimal(dDoubleValue2), nygVar.u(), Math.ulp(dDoubleValue2));
                                                } catch (NumberFormatException unused4) {
                                                    boolH2 = null;
                                                }
                                                if (boolH2 != null) {
                                                    if (boolH2.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                    }
                                                }
                                            }
                                        } else if (nygVar.t()) {
                                            w3h.h(w0hVar);
                                            tz0Var2.c(i0hVar.a(strW), i0hVar.b(strY), "No number filter for long param. event, param");
                                        } else {
                                            try {
                                                boolH = va9.h(new BigDecimal(((Long) obj).longValue()), nygVar.u(), 0.0d);
                                            } catch (NumberFormatException unused5) {
                                                boolH = null;
                                            }
                                            if (boolH != null) {
                                                if (boolH.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    } else {
                                        w3h.h(w0hVar);
                                        tz0Var2.b(i0hVar.a(strW), "Event has empty param name. event");
                                    }
                                }
                            } else {
                                e3hVar = (e3h) it2.next();
                                if (!hashSet.contains(e3hVar.s())) {
                                    if (e3hVar.v()) {
                                        String strS3 = e3hVar.s();
                                        if (e3hVar.v()) {
                                            lValueOf = Long.valueOf(e3hVar.w());
                                        } else {
                                            lValueOf = null;
                                        }
                                        kd0Var.put(strS3, lValueOf);
                                    } else if (e3hVar.z()) {
                                        String strS4 = e3hVar.s();
                                        if (e3hVar.z()) {
                                            dValueOf = Double.valueOf(e3hVar.A());
                                        } else {
                                            dValueOf = null;
                                        }
                                        kd0Var.put(strS4, dValueOf);
                                    } else if (e3hVar.t()) {
                                        kd0Var.put(e3hVar.s(), e3hVar.u());
                                    } else {
                                        w3h.h(w0hVar);
                                        tz0Var2.c(i0hVar.a(strW), i0hVar.b(e3hVar.s()), "Unknown value for param. event, param");
                                    }
                                }
                            }
                        }
                    } else {
                        nygVar2 = (nyg) it.next();
                        if (nygVar2.y().isEmpty()) {
                            w3h.h(w0hVar);
                            tz0Var2.b(i0hVar.a(strW), "null or empty param name in filter. event");
                        } else {
                            hashSet.add(nygVar2.y());
                        }
                    }
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        zL0 = zL0;
        w0hVar = w0hVar;
        break;
        w3h.h(w0hVar);
        tz0Var.b(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.d = bool2;
        if (!z3 || !v2hVar.x()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(v2hVar.y());
        if (lygVar.A()) {
            if (zL0 && lygVar.x()) {
                lValueOf2 = l;
            }
            this.f = lValueOf2;
            return true;
        }
        if (zL0 && lygVar.x()) {
            lValueOf2 = l2;
        }
        this.e = lValueOf2;
        return true;
    }

    public boolean j(Long l, Long l2, p4h p4hVar, boolean z) {
        boolean z2;
        Boolean boolF;
        Boolean boolH;
        Boolean boolH2;
        Boolean boolH3;
        hpg.a();
        w3h w3hVar = (w3h) this.h.b;
        qqg qqgVar = w3hVar.d;
        i0h i0hVar = w3hVar.x;
        w0h w0hVar = w3hVar.f;
        boolean zL0 = qqgVar.L0(this.a, bzg.D0);
        uyg uygVar = (uyg) this.i;
        boolean zV = uygVar.v();
        boolean zW = uygVar.w();
        boolean zY = uygVar.y();
        boolean z3 = zV || zW || zY;
        if (z && !z3) {
            w3h.h(w0hVar);
            w0hVar.Z.c(Integer.valueOf(this.b), uygVar.r() ? Integer.valueOf(uygVar.s()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        nyg nygVarU = uygVar.u();
        boolean zW2 = nygVarU.w();
        if (!p4hVar.w()) {
            z2 = zY;
            if (!p4hVar.A()) {
                if (!p4hVar.u()) {
                    w3h.h(w0hVar);
                    w0hVar.x.b(i0hVar.c(p4hVar.t()), "User property has no value, property");
                } else if (nygVarU.r()) {
                    String strV = p4hVar.v();
                    wyg wygVarS = nygVarU.s();
                    w3h.h(w0hVar);
                    boolF = va9.f(va9.g(strV, wygVarS, w0hVar), zW2);
                } else if (!nygVarU.t()) {
                    w3h.h(w0hVar);
                    w0hVar.x.b(i0hVar.c(p4hVar.t()), "No string or number filter defined. property");
                } else if (lch.e1(p4hVar.v())) {
                    String strV2 = p4hVar.v();
                    qyg qygVarU = nygVarU.u();
                    if (lch.e1(strV2)) {
                        try {
                            boolH = va9.h(new BigDecimal(strV2), qygVarU, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolH = null;
                        }
                    } else {
                        boolH = null;
                    }
                    boolF = va9.f(boolH, zW2);
                } else {
                    w3h.h(w0hVar);
                    w0hVar.x.c(i0hVar.c(p4hVar.t()), p4hVar.v(), "Invalid user property value for Numeric number filter. property, value");
                }
                boolF = null;
            } else if (nygVarU.t()) {
                double dB = p4hVar.B();
                try {
                    boolH2 = va9.h(new BigDecimal(dB), nygVarU.u(), Math.ulp(dB));
                } catch (NumberFormatException unused2) {
                    boolH2 = null;
                }
                boolF = va9.f(boolH2, zW2);
            } else {
                w3h.h(w0hVar);
                w0hVar.x.b(i0hVar.c(p4hVar.t()), "No number filter for double property. property");
                boolF = null;
            }
        } else if (nygVarU.t()) {
            z2 = zY;
            try {
                boolH3 = va9.h(new BigDecimal(p4hVar.x()), nygVarU.u(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolH3 = null;
            }
            boolF = va9.f(boolH3, zW2);
        } else {
            w3h.h(w0hVar);
            w0hVar.x.b(i0hVar.c(p4hVar.t()), "No number filter for long property. property");
            z2 = zY;
            boolF = null;
        }
        w3h.h(w0hVar);
        w0hVar.Z.b(boolF == null ? "null" : boolF, "Property filter result");
        if (boolF == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (!z2 || boolF.booleanValue()) {
            if (!z || uygVar.v()) {
                this.d = boolF;
            }
            if (boolF.booleanValue() && z3 && p4hVar.r()) {
                long jS = p4hVar.s();
                if (l != null) {
                    jS = l.longValue();
                }
                if (zL0 && uygVar.v() && !uygVar.w() && l2 != null) {
                    jS = l2.longValue();
                }
                if (uygVar.w()) {
                    this.f = Long.valueOf(jS);
                } else {
                    this.e = Long.valueOf(jS);
                }
            }
        }
        return true;
    }
}
