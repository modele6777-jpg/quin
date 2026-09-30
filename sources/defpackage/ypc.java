package defpackage;

import java.util.List;
import tech.chatmind.api.seasonal.model.SeasonalCard;
import tech.chatmind.api.seasonal.model.SeasonalReadingResponse;
import tech.chatmind.api.seasonal.model.SeasonalUserInfo;
import tech.chatmind.api.seasonal.model.SolarTerm;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ypc extends gbe implements l26 {
    final /* synthetic */ List<SeasonalCard> $cards;
    final /* synthetic */ SolarTerm $solarTerm;
    final /* synthetic */ SeasonalUserInfo $userInfo;
    final /* synthetic */ int $year;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ lqc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypc(lqc lqcVar, int i, SolarTerm solarTerm, SeasonalUserInfo seasonalUserInfo, List list, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = lqcVar;
        this.$year = i;
        this.$solarTerm = solarTerm;
        this.$userInfo = seasonalUserInfo;
        this.$cards = list;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ypc ypcVar = new ypc(this.this$0, this.$year, this.$solarTerm, this.$userInfo, this.$cards, xn2Var);
        ypcVar.L$0 = obj;
        return ypcVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7 A[PHI: r0
  0x00c7: PHI (r0v23 znc) = (r0v20 znc), (r0v30 znc) binds: [B:36:0x00c3, B:18:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:55:0x0145  */
    /* JADX WARN: Code duplicated, block: B:56:0x0147 A[Catch: Exception -> 0x004a, PHI: r0
  0x0147: PHI (r0v40 java.lang.Object) = (r0v37 java.lang.Object), (r0v52 java.lang.Object) binds: [B:54:0x0143, B:13:0x0046] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x004a, blocks: (B:12:0x0043, B:56:0x0147, B:53:0x011f), top: B:85:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0151  */
    /* JADX WARN: Code duplicated, block: B:61:0x0174  */
    /* JADX WARN: Code duplicated, block: B:65:0x018c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0260 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x0261 A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x0151, please report this as an issue */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Exception exc;
        upc upcVarI;
        Object objF;
        znc zncVarZ;
        long j;
        SeasonalReadingResponse seasonalReadingResponseA;
        Object opcVar;
        opc opcVar2;
        Object objP0;
        ServerResponse serverResponse;
        boolean success;
        lqc lqcVar;
        ybc ybcVar;
        String errorMessage;
        opc opcVar3;
        xj5 xj5Var = (xj5) this.L$0;
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            switch (i) {
                case 0:
                    jzb.q(obj);
                    lqc lqcVar2 = this.this$0;
                    int i2 = this.$year;
                    SolarTerm solarTerm = this.$solarTerm;
                    int i3 = lqc.c;
                    lqcVar2.getClass();
                    if (i2 <= 0 || solarTerm == SolarTerm.UNKNOWN) {
                        opc opcVar4 = new opc(null);
                        this.L$0 = null;
                        this.label = 1;
                        if (xj5Var.a(opcVar4, this) != bw2Var) {
                            return wefVar;
                        }
                    } else {
                        lqc lqcVar3 = this.this$0;
                        int i4 = this.$year;
                        SolarTerm solarTerm2 = this.$solarTerm;
                        lqcVar3.getClass();
                        zncVarZ = v2c.z(i4, solarTerm2.getWireValue());
                        ppc ppcVar = ppc.a;
                        if (zncVarZ != null) {
                            this.L$0 = xj5Var;
                            this.L$1 = zncVarZ;
                            this.label = 2;
                            if (xj5Var.a(ppcVar, this) != bw2Var) {
                                lqc lqcVar4 = this.this$0;
                                int i5 = lqc.c;
                                lqcVar4.getClass();
                                if (zncVarZ == znc.GENERATION_SLOW) {
                                    j = 20000;
                                } else {
                                    j = 1000;
                                }
                                this.L$0 = xj5Var;
                                this.L$1 = zncVarZ;
                                this.label = 3;
                                if (vfh.q(j, this) != bw2Var) {
                                    if (zncVarZ == znc.GENERATION_ERROR) {
                                        opcVar2 = new opc("QA fixture generation error");
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.label = 4;
                                        if (xj5Var.a(opcVar2, this) == bw2Var) {
                                            return wefVar;
                                        }
                                    } else {
                                        seasonalReadingResponseA = ync.a(ync.a, this.$year, this.$solarTerm, this.$userInfo, this.$cards, null, 16);
                                        if (seasonalReadingResponseA != null) {
                                            opcVar = new spc(seasonalReadingResponseA);
                                        } else {
                                            opcVar = new opc(null);
                                        }
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 5;
                                        if (xj5Var.a(opcVar, this) == bw2Var) {
                                            return wefVar;
                                        }
                                    }
                                }
                            }
                        } else {
                            this.L$0 = xj5Var;
                            this.L$1 = null;
                            this.label = 6;
                            if (xj5Var.a(ppcVar, this) != bw2Var) {
                                mqc mqcVar = this.this$0.a;
                                int i6 = this.$year;
                                SolarTerm solarTerm3 = this.$solarTerm;
                                SeasonalUserInfo seasonalUserInfo = this.$userInfo;
                                List<SeasonalCard> list = this.$cards;
                                this.L$0 = xj5Var;
                                this.L$1 = null;
                                this.label = 7;
                                rqc rqcVar = (rqc) mqcVar;
                                js3 js3Var = ga4.a;
                                objP0 = ynb.p0(hr3.c, new nqc(rqcVar, i6, solarTerm3, seasonalUserInfo, list, null), this);
                                if (objP0 == bw2Var) {
                                    serverResponse = (ServerResponse) objP0;
                                    success = serverResponse.getSuccess();
                                    lqcVar = this.this$0;
                                    if (!success) {
                                        int i7 = this.$year;
                                        SolarTerm solarTerm4 = this.$solarTerm;
                                        vx7 vx7Var = new vx7(1, this.this$0, lqc.class, "readingTerminal", "readingTerminal(Ltech/chatmind/api/seasonal/model/SeasonalReadingResponse;)Lai/askquin/data/SeasonalRepository$SeasonalProgress;", 0, 19);
                                        int i8 = lqc.c;
                                        lqcVar.getClass();
                                        ybcVar = new ybc(new kqc(lqcVar, i7, solarTerm4, vx7Var, null));
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 12;
                                        if (ok8.r(xj5Var, ybcVar, this) == bw2Var) {
                                            return wefVar;
                                        }
                                    } else {
                                        lqcVar.d().b("Seasonal createReading returned success=false: " + serverResponse.getErrorMessage());
                                        errorMessage = serverResponse.getErrorMessage();
                                        if (v4e.Q(errorMessage)) {
                                            errorMessage = null;
                                        }
                                        opcVar3 = new opc(errorMessage);
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 11;
                                        if (xj5Var.a(opcVar3, this) == bw2Var) {
                                            return wefVar;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return bw2Var;
                case 1:
                    jzb.q(obj);
                    return wefVar;
                case 2:
                    zncVarZ = (znc) this.L$1;
                    jzb.q(obj);
                    lqc lqcVar5 = this.this$0;
                    int i9 = lqc.c;
                    lqcVar5.getClass();
                    if (zncVarZ == znc.GENERATION_SLOW) {
                        j = 20000;
                    } else {
                        j = 1000;
                    }
                    this.L$0 = xj5Var;
                    this.L$1 = zncVarZ;
                    this.label = 3;
                    if (vfh.q(j, this) != bw2Var) {
                        if (zncVarZ == znc.GENERATION_ERROR) {
                            opcVar2 = new opc("QA fixture generation error");
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 4;
                            if (xj5Var.a(opcVar2, this) == bw2Var) {
                                return wefVar;
                            }
                        } else {
                            seasonalReadingResponseA = ync.a(ync.a, this.$year, this.$solarTerm, this.$userInfo, this.$cards, null, 16);
                            if (seasonalReadingResponseA != null) {
                                opcVar = new spc(seasonalReadingResponseA);
                            } else {
                                opcVar = new opc(null);
                            }
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 5;
                            if (xj5Var.a(opcVar, this) == bw2Var) {
                                return wefVar;
                            }
                        }
                    }
                    return bw2Var;
                case 3:
                    zncVarZ = (znc) this.L$1;
                    jzb.q(obj);
                    if (zncVarZ == znc.GENERATION_ERROR) {
                        opcVar2 = new opc("QA fixture generation error");
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 4;
                        if (xj5Var.a(opcVar2, this) == bw2Var) {
                            return bw2Var;
                        }
                        return wefVar;
                    }
                    seasonalReadingResponseA = ync.a(ync.a, this.$year, this.$solarTerm, this.$userInfo, this.$cards, null, 16);
                    if (seasonalReadingResponseA != null) {
                        opcVar = new spc(seasonalReadingResponseA);
                    } else {
                        opcVar = new opc(null);
                    }
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    if (xj5Var.a(opcVar, this) == bw2Var) {
                        return bw2Var;
                    }
                    return wefVar;
                case 4:
                    jzb.q(obj);
                    return wefVar;
                case 5:
                    jzb.q(obj);
                    return wefVar;
                case 6:
                    jzb.q(obj);
                    mqc mqcVar2 = this.this$0.a;
                    int i10 = this.$year;
                    SolarTerm solarTerm5 = this.$solarTerm;
                    SeasonalUserInfo seasonalUserInfo2 = this.$userInfo;
                    List<SeasonalCard> list2 = this.$cards;
                    this.L$0 = xj5Var;
                    this.L$1 = null;
                    this.label = 7;
                    rqc rqcVar2 = (rqc) mqcVar2;
                    js3 js3Var2 = ga4.a;
                    objP0 = ynb.p0(hr3.c, new nqc(rqcVar2, i10, solarTerm5, seasonalUserInfo2, list2, null), this);
                    if (objP0 == bw2Var) {
                        serverResponse = (ServerResponse) objP0;
                        success = serverResponse.getSuccess();
                        lqcVar = this.this$0;
                        if (!success) {
                            lqcVar.d().b("Seasonal createReading returned success=false: " + serverResponse.getErrorMessage());
                            errorMessage = serverResponse.getErrorMessage();
                            if (v4e.Q(errorMessage)) {
                                errorMessage = null;
                            }
                            opcVar3 = new opc(errorMessage);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 11;
                            if (xj5Var.a(opcVar3, this) == bw2Var) {
                                return wefVar;
                            }
                        } else {
                            int i11 = this.$year;
                            SolarTerm solarTerm6 = this.$solarTerm;
                            vx7 vx7Var2 = new vx7(1, this.this$0, lqc.class, "readingTerminal", "readingTerminal(Ltech/chatmind/api/seasonal/model/SeasonalReadingResponse;)Lai/askquin/data/SeasonalRepository$SeasonalProgress;", 0, 19);
                            int i12 = lqc.c;
                            lqcVar.getClass();
                            ybcVar = new ybc(new kqc(lqcVar, i11, solarTerm6, vx7Var2, null));
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 12;
                            if (ok8.r(xj5Var, ybcVar, this) == bw2Var) {
                                return wefVar;
                            }
                        }
                    }
                    return bw2Var;
                case 7:
                    jzb.q(obj);
                    objP0 = obj;
                    serverResponse = (ServerResponse) objP0;
                    success = serverResponse.getSuccess();
                    lqcVar = this.this$0;
                    if (!success) {
                        int i13 = this.$year;
                        SolarTerm solarTerm7 = this.$solarTerm;
                        vx7 vx7Var3 = new vx7(1, this.this$0, lqc.class, "readingTerminal", "readingTerminal(Ltech/chatmind/api/seasonal/model/SeasonalReadingResponse;)Lai/askquin/data/SeasonalRepository$SeasonalProgress;", 0, 19);
                        int i14 = lqc.c;
                        lqcVar.getClass();
                        ybcVar = new ybc(new kqc(lqcVar, i13, solarTerm7, vx7Var3, null));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 12;
                        if (ok8.r(xj5Var, ybcVar, this) == bw2Var) {
                            return bw2Var;
                        }
                        return wefVar;
                    }
                    lqcVar.d().b("Seasonal createReading returned success=false: " + serverResponse.getErrorMessage());
                    errorMessage = serverResponse.getErrorMessage();
                    if (v4e.Q(errorMessage)) {
                        errorMessage = null;
                    }
                    opcVar3 = new opc(errorMessage);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 11;
                    if (xj5Var.a(opcVar3, this) == bw2Var) {
                        return bw2Var;
                    }
                    return wefVar;
                case 8:
                    upcVarI = (upc) this.L$3;
                    exc = (Exception) this.L$2;
                    jzb.q(obj);
                    objF = obj;
                    if (((Boolean) objF).booleanValue()) {
                        lqc lqcVar6 = this.this$0;
                        int i15 = this.$year;
                        SolarTerm solarTerm8 = this.$solarTerm;
                        vx7 vx7Var4 = new vx7(1, this.this$0, lqc.class, "readingTerminal", "readingTerminal(Ltech/chatmind/api/seasonal/model/SeasonalReadingResponse;)Lai/askquin/data/SeasonalRepository$SeasonalProgress;", 0, 20);
                        int i16 = lqc.c;
                        lqcVar6.getClass();
                        ybc ybcVar2 = new ybc(new kqc(lqcVar6, i15, solarTerm8, vx7Var4, null));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 9;
                        if (ok8.r(xj5Var, ybcVar2, this) == bw2Var) {
                            return bw2Var;
                        }
                        return wefVar;
                    }
                    this.this$0.d().c("Failed to create seasonal reading", exc);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 10;
                    if (xj5Var.a(upcVarI, this) != bw2Var) {
                        return bw2Var;
                    }
                    return wefVar;
                case 9:
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    jzb.q(obj);
                    return wefVar;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    jzb.q(obj);
                    return wefVar;
                default:
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Exception e) {
            exc = e;
            ynb.h0(exc);
            lqc lqcVar7 = this.this$0;
            int i17 = lqc.c;
            lqcVar7.getClass();
            upcVarI = lqc.i(exc);
            if (upcVarI instanceof opc) {
                lqc lqcVar8 = this.this$0;
                int i18 = this.$year;
                SolarTerm solarTerm9 = this.$solarTerm;
                this.L$0 = xj5Var;
                this.L$1 = null;
                this.L$2 = exc;
                this.L$3 = upcVarI;
                this.label = 8;
                objF = lqcVar8.f(i18, solarTerm9, this);
                if (objF != bw2Var) {
                }
            } else {
                this.this$0.d().c("Failed to create seasonal reading", exc);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 10;
                if (xj5Var.a(upcVarI, this) != bw2Var) {
                    return wefVar;
                }
            }
            return bw2Var;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ypc) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
