package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q8f {
    public static final q8f b = new q8f(o8f.a);
    public final o8f a;

    public q8f(o8f o8fVar) {
        this.a = o8fVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 8:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i != 37) {
            switch (i) {
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case CommonUtils.DEVICE_STATE_COMPROMISEDLIBRARIES /* 32 */:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static dsf b(dsf dsfVar, dsf dsfVar2) {
        if (dsfVar == null) {
            a(38);
            throw null;
        }
        if (dsfVar2 == null) {
            a(39);
            throw null;
        }
        dsf dsfVar3 = dsf.INVARIANT;
        if (dsfVar == dsfVar3) {
            if (dsfVar2 != null) {
                return dsfVar2;
            }
            a(40);
            throw null;
        }
        if (dsfVar2 == dsfVar3) {
            if (dsfVar != null) {
                return dsfVar;
            }
            a(41);
            throw null;
        }
        if (dsfVar == dsfVar2) {
            if (dsfVar2 != null) {
                return dsfVar2;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + dsfVar + "' and projection kind '" + dsfVar2 + "' cannot be combined");
    }

    public static int c(dsf dsfVar, dsf dsfVar2) {
        dsf dsfVar3 = dsf.OUT_VARIANCE;
        dsf dsfVar4 = dsf.IN_VARIANCE;
        if (dsfVar == dsfVar4 && dsfVar2 == dsfVar3) {
            return 3;
        }
        return (dsfVar == dsfVar3 && dsfVar2 == dsfVar4) ? 2 : 1;
    }

    public static q8f d(tt7 tt7Var) {
        if (tt7Var == null) {
            a(6);
            throw null;
        }
        return new q8f(l7f.b.g(tt7Var.c0(), tt7Var.Z()));
    }

    public static q8f e(o8f o8fVar, o8f o8fVar2) {
        if (o8fVar == null) {
            a(3);
            throw null;
        }
        if (o8fVar2 == null) {
            a(4);
            throw null;
        }
        if (o8fVar.e()) {
            o8fVar = o8fVar2;
        } else if (!o8fVar2.e()) {
            o8fVar = new m94(o8fVar, o8fVar2);
        }
        return new q8f(o8fVar);
    }

    public static String g(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (z5c.C(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public final tt7 f(tt7 tt7Var, dsf dsfVar) {
        if (tt7Var == null) {
            a(9);
            throw null;
        }
        if (this.a.e()) {
            return tt7Var;
        }
        try {
            tt7 tt7VarB = i(new dzd(tt7Var, dsfVar), null, 0).b();
            if (tt7VarB != null) {
                return tt7VarB;
            }
            a(12);
            throw null;
        } catch (p8f e) {
            return sy4.c(qy4.w, e.getMessage());
        }
    }

    public final tt7 h(tt7 tt7Var, dsf dsfVar) {
        if (tt7Var == null) {
            a(14);
            throw null;
        }
        if (dsfVar == null) {
            a(15);
            throw null;
        }
        o8f o8fVar = this.a;
        i8f dzdVar = new dzd(o8fVar.f(tt7Var, dsfVar), dsfVar);
        if (!o8fVar.e()) {
            try {
                dzdVar = i(dzdVar, null, 0);
            } catch (p8f unused) {
                dzdVar = null;
            }
        }
        if (o8fVar.a() || o8fVar.b()) {
            boolean zB = o8fVar.b();
            if (dzdVar == null) {
                dzdVar = null;
            } else if (!dzdVar.c()) {
                tt7 tt7VarB = dzdVar.b();
                tt7VarB.getClass();
                if (w8f.c(tt7VarB, zo1.b, null)) {
                    dsf dsfVarA = dzdVar.a();
                    dsfVarA.getClass();
                    if (dsfVarA == dsf.OUT_VARIANCE) {
                        dzdVar = new dzd((tt7) if9.l(tt7VarB).b, dsfVarA);
                    } else if (zB) {
                        dzdVar = new dzd((tt7) if9.l(tt7VarB).a, dsfVarA);
                    } else {
                        ap1 ap1Var = new ap1();
                        q8f q8fVar = new q8f(ap1Var);
                        if (!ap1Var.e()) {
                            try {
                                dzdVar = q8fVar.i(dzdVar, null, 0);
                            } catch (p8f unused2) {
                                dzdVar = null;
                            }
                        }
                    }
                }
            }
        }
        if (dzdVar == null) {
            return null;
        }
        return dzdVar.b();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:105:0x0214  */
    /* JADX WARN: Code duplicated, block: B:107:0x021c  */
    /* JADX WARN: Code duplicated, block: B:108:0x021f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0222  */
    /* JADX WARN: Code duplicated, block: B:111:0x0225  */
    /* JADX WARN: Code duplicated, block: B:114:0x022a  */
    /* JADX WARN: Code duplicated, block: B:116:0x022e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0236  */
    /* JADX WARN: Code duplicated, block: B:120:0x0245  */
    /* JADX WARN: Code duplicated, block: B:125:0x0266  */
    /* JADX WARN: Code duplicated, block: B:127:0x028a  */
    /* JADX WARN: Code duplicated, block: B:129:0x028d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0291  */
    /* JADX WARN: Code duplicated, block: B:134:0x0297  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:144:0x02be  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0141  */
    /* JADX WARN: Code duplicated, block: B:64:0x0151  */
    /* JADX WARN: Code duplicated, block: B:66:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0162  */
    /* JADX WARN: Code duplicated, block: B:74:0x017e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0181  */
    /* JADX WARN: Code duplicated, block: B:80:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0192 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0195  */
    /* JADX WARN: Code duplicated, block: B:86:0x019e  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01be  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f0  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final i8f i(i8f i8fVar, c8f c8fVar, int i) throws p8f {
        tt7 tt7VarB;
        dsf dsfVarA;
        jgf jgfVarK0;
        j jVar;
        tjd tjdVar;
        dsf dsfVar;
        List parameters;
        List listZ;
        ArrayList arrayList;
        boolean z;
        tt7 tt7VarT;
        c8f c8fVar2;
        i8f i8fVar2;
        i8f i8fVarI;
        int iB;
        char c;
        q8f q8fVar;
        m17 m17Var;
        int iC;
        f00 f00VarK0;
        r13 r13Var;
        tt7 tt7VarI;
        h10 h10VarC;
        int iB2;
        q8f q8fVar2 = this;
        tt7 tt7VarH = null;
        if (i8fVar == null) {
            a(18);
            throw null;
        }
        o8f o8fVar = q8fVar2.a;
        if (i > 100) {
            cva.n("Recursion too deep. Most likely infinite loop while substituting ", g(i8fVar), "; substitution: ", g(o8fVar));
            return null;
        }
        if (!i8fVar.c()) {
            tt7 tt7VarB2 = i8fVar.b();
            if (tt7VarB2 instanceof y8f) {
                y8f y8fVar = (y8f) tt7VarB2;
                jgf jgfVarM = y8fVar.M();
                tt7 tt7VarP = y8fVar.p();
                i8f i8fVarI2 = q8fVar2.i(new dzd(jgfVarM, i8fVar.a()), c8fVar, i + 1);
                return i8fVarI2.c() ? i8fVarI2 : new dzd(q7c.t(i8fVarI2.b().k0(), q8fVar2.h(tt7VarP, i8fVar.a())), i8fVarI2.a());
            }
            tt7VarB2.getClass();
            tt7VarB2.k0();
            if (!(tt7VarB2.k0() instanceof mdb)) {
                i8f i8fVarD = o8fVar.d(tt7VarB2);
                if (i8fVarD == null) {
                    i8fVarD = null;
                } else if (tt7VarB2.getAnnotations().E(syd.y)) {
                    j7f j7fVarC0 = i8fVarD.b().c0();
                    if (j7fVarC0 instanceof ve9) {
                        i8f i8fVar3 = ((ve9) j7fVarC0).a;
                        dsf dsfVarA2 = i8fVar3.a();
                        if (c(i8fVar.a(), dsfVarA2) == 3) {
                            i8fVarD = new dzd(i8fVar3.b());
                        } else if (c8fVar != null && c(c8fVar.x(), dsfVarA2) == 3) {
                            i8fVarD = new dzd(i8fVar3.b());
                        }
                    }
                }
                dsf dsfVarA3 = i8fVar.a();
                int i2 = 0;
                if (i8fVarD == null && (tt7VarB2.k0() instanceof bj5)) {
                    f00 f00VarK1 = tt7VarB2.k0();
                    r13 r13Var2 = f00VarK1 instanceof r13 ? (r13) f00VarK1 : null;
                    if (!(r13Var2 != null ? r13Var2.E() : false)) {
                        bj5 bj5Var = (bj5) tt7VarB2.k0();
                        tjd tjdVar2 = bj5Var.c;
                        tjd tjdVar3 = bj5Var.b;
                        int i3 = i + 1;
                        i8f i8fVarI3 = q8fVar2.i(new dzd(tjdVar3, dsfVarA3), c8fVar, i3);
                        i8f i8fVarI4 = q8fVar2.i(new dzd(tjdVar2, dsfVarA3), c8fVar, i3);
                        dsf dsfVarA4 = i8fVarI3.a();
                        if (i8fVarI3.b() != tjdVar3 || i8fVarI4.b() != tjdVar2) {
                            return new dzd(rxg.E(w6c.d(i8fVarI3.b()), w6c.d(i8fVarI4.b())), dsfVarA4);
                        }
                    } else if (!xr7.F(tt7VarB2)) {
                        if (i8fVarD != null) {
                            iC = c(dsfVarA3, i8fVarD.a());
                            if (!(tt7VarB2.c0() instanceof bp1)) {
                                iB2 = kv2.B(iC);
                                if (iB2 != 1) {
                                    return new dzd(tt7VarB2.c0().f().p(), dsf.OUT_VARIANCE);
                                }
                                if (iB2 == 2) {
                                    throw new p8f("Out-projection in in-position");
                                }
                            }
                            f00VarK0 = tt7VarB2.k0();
                            if (f00VarK0 instanceof r13) {
                                r13Var = (r13) f00VarK0;
                            } else {
                                r13Var = null;
                            }
                            if (r13Var != null) {
                                r13Var = null;
                            } else {
                                r13Var = null;
                            }
                            if (i8fVarD.c()) {
                                return i8fVarD;
                            }
                            if (r13Var != null) {
                                tt7VarI = r13Var.v(i8fVarD.b());
                            } else {
                                tt7VarI = w8f.i(i8fVarD.b(), tt7VarB2.i0());
                            }
                            if (!tt7VarB2.getAnnotations().isEmpty()) {
                                h10VarC = o8fVar.c(tt7VarB2.getAnnotations());
                                if (h10VarC != null) {
                                    a(33);
                                    throw null;
                                }
                                if (h10VarC.E(syd.y)) {
                                    h10VarC = new te5(h10VarC, new qqf(12));
                                }
                                tt7VarI = o7c.y(tt7VarI, new j10(new h10[]{tt7VarI.getAnnotations(), h10VarC}));
                            }
                            if (iC == 1) {
                                dsfVarA3 = b(dsfVarA3, i8fVarD.a());
                            }
                            return new dzd(tt7VarI, dsfVarA3);
                        }
                        tt7VarB = i8fVar.b();
                        dsfVarA = i8fVar.a();
                        if (!(tt7VarB.c0().m() instanceof c8f)) {
                            jgfVarK0 = tt7VarB.k0();
                            if (jgfVarK0 instanceof j) {
                                jVar = (j) jgfVarK0;
                            } else {
                                jVar = null;
                            }
                            if (jVar != null) {
                                tjdVar = jVar.c;
                            } else {
                                tjdVar = null;
                            }
                            dsfVar = dsf.INVARIANT;
                            if (tjdVar != null) {
                                if (o8fVar instanceof m17) {
                                    m17Var = (m17) o8fVar;
                                    if (m17Var.d) {
                                        q8fVar = new q8f(new m17(m17Var.b, m17Var.c, false));
                                    } else {
                                        q8fVar = q8fVar2;
                                    }
                                } else {
                                    q8fVar = q8fVar2;
                                }
                                tt7VarH = q8fVar.h(tjdVar, dsfVar);
                            }
                            parameters = tt7VarB.c0().getParameters();
                            listZ = tt7VarB.Z();
                            arrayList = new ArrayList(parameters.size());
                            z = false;
                            while (i2 < parameters.size()) {
                                c8fVar2 = (c8f) parameters.get(i2);
                                i8fVar2 = (i8f) listZ.get(i2);
                                i8fVarI = q8fVar2.i(i8fVar2, c8fVar2, i + 1);
                                iB = kv2.B(c(c8fVar2.x(), i8fVarI.a()));
                                if (iB != 0) {
                                    if (iB != 1) {
                                        c = 2;
                                        if (iB == 2) {
                                        }
                                    } else {
                                        c = 2;
                                    }
                                    i8fVarI = w8f.k(c8fVar2);
                                } else {
                                    c = 2;
                                    if (c8fVar2.x() != dsfVar) {
                                        i8fVarI = new dzd(i8fVarI.b(), dsfVar);
                                    }
                                }
                                if (i8fVarI != i8fVar2) {
                                    z = true;
                                }
                                arrayList.add(i8fVarI);
                                i2++;
                                q8fVar2 = this;
                            }
                            if (z) {
                                listZ = arrayList;
                            }
                            h10 h10VarC2 = o8fVar.c(tt7VarB.getAnnotations());
                            listZ.getClass();
                            h10VarC2.getClass();
                            tt7VarT = w6c.t(tt7VarB, listZ, h10VarC2, 4);
                            if (tt7VarT instanceof tjd) {
                                tt7VarT = o7c.E((tjd) tt7VarT, (tjd) tt7VarH);
                            }
                            return new dzd(tt7VarT, dsfVarA);
                        }
                    }
                } else if (!xr7.F(tt7VarB2) && !i7h.x(tt7VarB2)) {
                    if (i8fVarD != null) {
                        iC = c(dsfVarA3, i8fVarD.a());
                        if (!(tt7VarB2.c0() instanceof bp1)) {
                            iB2 = kv2.B(iC);
                            if (iB2 != 1) {
                                return new dzd(tt7VarB2.c0().f().p(), dsf.OUT_VARIANCE);
                            }
                            if (iB2 == 2) {
                                throw new p8f("Out-projection in in-position");
                            }
                        }
                        f00VarK0 = tt7VarB2.k0();
                        if (f00VarK0 instanceof r13) {
                            r13Var = (r13) f00VarK0;
                        } else {
                            r13Var = null;
                        }
                        if (r13Var != null || !r13Var.E()) {
                            r13Var = null;
                        }
                        if (i8fVarD.c()) {
                            return i8fVarD;
                        }
                        if (r13Var != null) {
                            tt7VarI = r13Var.v(i8fVarD.b());
                        } else {
                            tt7VarI = w8f.i(i8fVarD.b(), tt7VarB2.i0());
                        }
                        if (!tt7VarB2.getAnnotations().isEmpty()) {
                            h10VarC = o8fVar.c(tt7VarB2.getAnnotations());
                            if (h10VarC != null) {
                                a(33);
                                throw null;
                            }
                            if (h10VarC.E(syd.y)) {
                                h10VarC = new te5(h10VarC, new qqf(12));
                            }
                            tt7VarI = o7c.y(tt7VarI, new j10(new h10[]{tt7VarI.getAnnotations(), h10VarC}));
                        }
                        if (iC == 1) {
                            dsfVarA3 = b(dsfVarA3, i8fVarD.a());
                        }
                        return new dzd(tt7VarI, dsfVarA3);
                    }
                    tt7VarB = i8fVar.b();
                    dsfVarA = i8fVar.a();
                    if (!(tt7VarB.c0().m() instanceof c8f)) {
                        jgfVarK0 = tt7VarB.k0();
                        if (jgfVarK0 instanceof j) {
                            jVar = (j) jgfVarK0;
                        } else {
                            jVar = null;
                        }
                        if (jVar != null) {
                            tjdVar = jVar.c;
                        } else {
                            tjdVar = null;
                        }
                        dsfVar = dsf.INVARIANT;
                        if (tjdVar != null) {
                            if (o8fVar instanceof m17) {
                                m17Var = (m17) o8fVar;
                                if (m17Var.d) {
                                    q8fVar = q8fVar2;
                                } else {
                                    q8fVar = new q8f(new m17(m17Var.b, m17Var.c, false));
                                }
                            } else {
                                q8fVar = q8fVar2;
                            }
                            tt7VarH = q8fVar.h(tjdVar, dsfVar);
                        }
                        parameters = tt7VarB.c0().getParameters();
                        listZ = tt7VarB.Z();
                        arrayList = new ArrayList(parameters.size());
                        z = false;
                        while (i2 < parameters.size()) {
                            c8fVar2 = (c8f) parameters.get(i2);
                            i8fVar2 = (i8f) listZ.get(i2);
                            i8fVarI = q8fVar2.i(i8fVar2, c8fVar2, i + 1);
                            iB = kv2.B(c(c8fVar2.x(), i8fVarI.a()));
                            if (iB != 0) {
                                if (iB != 1) {
                                    c = 2;
                                    if (iB == 2) {
                                    }
                                } else {
                                    c = 2;
                                }
                                i8fVarI = w8f.k(c8fVar2);
                            } else {
                                c = 2;
                                if (c8fVar2.x() != dsfVar && !i8fVarI.c()) {
                                    i8fVarI = new dzd(i8fVarI.b(), dsfVar);
                                }
                            }
                            if (i8fVarI != i8fVar2) {
                                z = true;
                            }
                            arrayList.add(i8fVarI);
                            i2++;
                            q8fVar2 = this;
                        }
                        if (z) {
                            listZ = arrayList;
                        }
                        h10 h10VarC3 = o8fVar.c(tt7VarB.getAnnotations());
                        listZ.getClass();
                        h10VarC3.getClass();
                        tt7VarT = w6c.t(tt7VarB, listZ, h10VarC3, 4);
                        if ((tt7VarT instanceof tjd) && (tt7VarH instanceof tjd)) {
                            tt7VarT = o7c.E((tjd) tt7VarT, (tjd) tt7VarH);
                        }
                        return new dzd(tt7VarT, dsfVarA);
                    }
                }
            }
        }
        return i8fVar;
    }
}
