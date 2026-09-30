package defpackage;

import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.seasonal.model.SeasonalFollowUp;
import tech.chatmind.api.seasonal.model.SeasonalReadingResponse;
import tech.chatmind.api.seasonal.model.SeasonalStatus;
import tech.chatmind.api.seasonal.model.SolarTerm;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dqc extends gbe implements l26 {
    final /* synthetic */ String $question;
    final /* synthetic */ SolarTerm $solarTerm;
    final /* synthetic */ int $year;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ lqc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqc(lqc lqcVar, int i, SolarTerm solarTerm, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = lqcVar;
        this.$year = i;
        this.$solarTerm = solarTerm;
        this.$question = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        dqc dqcVar = new dqc(this.this$0, this.$year, this.$solarTerm, this.$question, xn2Var);
        dqcVar.L$0 = obj;
        return dqcVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x022e  */
    /* JADX WARN: Code duplicated, block: B:116:0x02bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x02be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:121:0x023c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0228 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x020d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x01fb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb A[PHI: r0
  0x00cb: PHI (r0v14 znc) = (r0v11 znc), (r0v16 znc) binds: [B:35:0x00c7, B:21:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc A[PHI: r0
  0x00dc: PHI (r0v17 znc) = (r0v14 znc), (r0v25 znc) binds: [B:38:0x00d8, B:20:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:47:0x010d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0113  */
    /* JADX WARN: Code duplicated, block: B:57:0x0167  */
    /* JADX WARN: Code duplicated, block: B:58:0x0169 A[Catch: Exception -> 0x0050, PHI: r15
  0x0169: PHI (r15v27 java.lang.Object) = (r15v26 java.lang.Object), (r15v0 java.lang.Object) binds: [B:56:0x0165, B:14:0x004b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x0050, blocks: (B:14:0x004b, B:58:0x0169, B:55:0x0142), top: B:118:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0171  */
    /* JADX WARN: Code duplicated, block: B:63:0x0196  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x01df A[PHI: r15
  0x01df: PHI (r15v37 java.lang.Object) = (r15v36 java.lang.Object), (r15v0 java.lang.Object) binds: [B:71:0x01db, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x0201  */
    /* JADX WARN: Code duplicated, block: B:98:0x0224  */
    /* JADX WARN: Instruction removed from duplicated block: B:61:0x0171, please report this as an issue */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        znc zncVarZ;
        SeasonalReadingResponse seasonalReadingResponseA;
        upc opcVar;
        lpc lpcVar;
        lpc lpcVar2;
        ServerResponse serverResponse;
        String errorMessage;
        lpc lpcVar3;
        SeasonalReadingResponse seasonalReadingResponse;
        List<SeasonalFollowUp> followUps;
        Iterator<T> it;
        int i;
        String answer;
        cqc cqcVar;
        Iterator<T> it2;
        xj5 xj5Var = (xj5) this.L$0;
        int i2 = this.label;
        mpc mpcVar = mpc.a;
        int i3 = 1;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            switch (i2) {
                case 0:
                    jzb.q(obj);
                    lqc lqcVar = this.this$0;
                    int i4 = this.$year;
                    SolarTerm solarTerm = this.$solarTerm;
                    int i5 = lqc.c;
                    lqcVar.getClass();
                    if (i4 <= 0 || solarTerm == SolarTerm.UNKNOWN) {
                        lpc lpcVar4 = new lpc(new opc(null));
                        this.L$0 = null;
                        this.label = 1;
                        if (xj5Var.a(lpcVar4, this) != bw2Var) {
                            return wefVar;
                        }
                    } else {
                        lqc lqcVar2 = this.this$0;
                        int i6 = this.$year;
                        SolarTerm solarTerm2 = this.$solarTerm;
                        lqcVar2.getClass();
                        zncVarZ = v2c.z(i6, solarTerm2.getWireValue());
                        ppc ppcVar = ppc.a;
                        if (zncVarZ != null) {
                            lpc lpcVar5 = new lpc(ppcVar);
                            this.L$0 = xj5Var;
                            this.L$1 = zncVarZ;
                            this.label = 2;
                            if (xj5Var.a(lpcVar5, this) != bw2Var) {
                                this.L$0 = xj5Var;
                                this.L$1 = zncVarZ;
                                this.label = 3;
                                if (xj5Var.a(mpcVar, this) != bw2Var) {
                                    this.L$0 = xj5Var;
                                    this.L$1 = zncVarZ;
                                    this.label = 4;
                                    if (vfh.q(1000L, this) != bw2Var) {
                                        if (zncVarZ == znc.FOLLOW_UP_ERROR) {
                                            lpcVar2 = new lpc(new opc("QA fixture follow-up error"));
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.label = 5;
                                            if (xj5Var.a(lpcVar2, this) != bw2Var) {
                                                return wefVar;
                                            }
                                        } else {
                                            seasonalReadingResponseA = ync.a(ync.a, this.$year, this.$solarTerm, null, null, this.$question, 12);
                                            if (seasonalReadingResponseA != null) {
                                                opcVar = new spc(seasonalReadingResponseA);
                                            } else {
                                                opcVar = new opc(null);
                                            }
                                            lpcVar = new lpc(opcVar);
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.label = 6;
                                            if (xj5Var.a(lpcVar, this) != bw2Var) {
                                                return wefVar;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            lpc lpcVar6 = new lpc(ppcVar);
                            this.L$0 = xj5Var;
                            this.L$1 = null;
                            this.label = 7;
                            if (xj5Var.a(lpcVar6, this) != bw2Var) {
                                mqc mqcVar = this.this$0.a;
                                int i7 = this.$year;
                                SolarTerm solarTerm3 = this.$solarTerm;
                                String str = this.$question;
                                this.L$0 = xj5Var;
                                this.L$1 = null;
                                this.label = 8;
                                rqc rqcVar = (rqc) mqcVar;
                                js3 js3Var = ga4.a;
                                obj = ynb.p0(hr3.c, new oqc(rqcVar, i7, solarTerm3, str, null), this);
                                if (obj == bw2Var) {
                                    serverResponse = (ServerResponse) obj;
                                    if (serverResponse.getSuccess()) {
                                        this.L$0 = xj5Var;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 11;
                                        if (xj5Var.a(mpcVar, this) != bw2Var) {
                                            lqc lqcVar3 = this.this$0;
                                            int i8 = this.$year;
                                            SolarTerm solarTerm4 = this.$solarTerm;
                                            this.L$0 = xj5Var;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.label = 12;
                                            int i9 = lqc.c;
                                            obj = lqcVar3.a(i8, solarTerm4, this);
                                            if (obj != bw2Var) {
                                                seasonalReadingResponse = (SeasonalReadingResponse) obj;
                                                if (seasonalReadingResponse != null) {
                                                    followUps = seasonalReadingResponse.getFollowUps();
                                                } else {
                                                    followUps = null;
                                                }
                                                if (followUps == null) {
                                                    followUps = pu4.a;
                                                }
                                                int i10 = 0;
                                                if (followUps.isEmpty()) {
                                                    i = 0;
                                                } else {
                                                    it = followUps.iterator();
                                                    i = 0;
                                                    while (it.hasNext()) {
                                                        answer = ((SeasonalFollowUp) it.next()).getAnswer();
                                                        if (answer == null && !v4e.Q(answer) && (i = i + 1) < 0) {
                                                            t72.Y();
                                                            throw null;
                                                        }
                                                    }
                                                }
                                                if (!followUps.isEmpty()) {
                                                    it2 = followUps.iterator();
                                                    while (it2.hasNext()) {
                                                        if (((SeasonalFollowUp) it2.next()).getStatus() != SeasonalStatus.ERROR && (i10 = i10 + 1) < 0) {
                                                            t72.Y();
                                                            throw null;
                                                        }
                                                    }
                                                }
                                                lqc lqcVar4 = this.this$0;
                                                int i11 = this.$year;
                                                SolarTerm solarTerm5 = this.$solarTerm;
                                                nx6 nx6Var = new nx6(i, i10, i3);
                                                int i12 = lqc.c;
                                                lqcVar4.getClass();
                                                cqcVar = new cqc(new ybc(new kqc(lqcVar4, i11, solarTerm5, nx6Var, null)));
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.L$2 = null;
                                                this.L$3 = null;
                                                this.I$0 = i;
                                                this.I$1 = i10;
                                                this.label = 13;
                                                if (ok8.r(xj5Var, cqcVar, this) == bw2Var) {
                                                    return wefVar;
                                                }
                                            }
                                        }
                                    } else {
                                        this.this$0.d().b("Seasonal followUp returned success=false: " + serverResponse.getErrorMessage());
                                        errorMessage = serverResponse.getErrorMessage();
                                        if (v4e.Q(errorMessage)) {
                                            errorMessage = null;
                                        }
                                        lpcVar3 = new lpc(new opc(errorMessage));
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 10;
                                        if (xj5Var.a(lpcVar3, this) != bw2Var) {
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
                    this.L$0 = xj5Var;
                    this.L$1 = zncVarZ;
                    this.label = 3;
                    if (xj5Var.a(mpcVar, this) != bw2Var) {
                        this.L$0 = xj5Var;
                        this.L$1 = zncVarZ;
                        this.label = 4;
                        if (vfh.q(1000L, this) != bw2Var) {
                            if (zncVarZ == znc.FOLLOW_UP_ERROR) {
                                lpcVar2 = new lpc(new opc("QA fixture follow-up error"));
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 5;
                                if (xj5Var.a(lpcVar2, this) != bw2Var) {
                                    return wefVar;
                                }
                            } else {
                                seasonalReadingResponseA = ync.a(ync.a, this.$year, this.$solarTerm, null, null, this.$question, 12);
                                if (seasonalReadingResponseA != null) {
                                    opcVar = new spc(seasonalReadingResponseA);
                                } else {
                                    opcVar = new opc(null);
                                }
                                lpcVar = new lpc(opcVar);
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 6;
                                if (xj5Var.a(lpcVar, this) != bw2Var) {
                                    return wefVar;
                                }
                            }
                        }
                    }
                    return bw2Var;
                case 3:
                    zncVarZ = (znc) this.L$1;
                    jzb.q(obj);
                    this.L$0 = xj5Var;
                    this.L$1 = zncVarZ;
                    this.label = 4;
                    if (vfh.q(1000L, this) != bw2Var) {
                        if (zncVarZ == znc.FOLLOW_UP_ERROR) {
                            lpcVar2 = new lpc(new opc("QA fixture follow-up error"));
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 5;
                            if (xj5Var.a(lpcVar2, this) != bw2Var) {
                                return wefVar;
                            }
                        } else {
                            seasonalReadingResponseA = ync.a(ync.a, this.$year, this.$solarTerm, null, null, this.$question, 12);
                            if (seasonalReadingResponseA != null) {
                                opcVar = new spc(seasonalReadingResponseA);
                            } else {
                                opcVar = new opc(null);
                            }
                            lpcVar = new lpc(opcVar);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 6;
                            if (xj5Var.a(lpcVar, this) != bw2Var) {
                                return wefVar;
                            }
                        }
                    }
                    return bw2Var;
                case 4:
                    zncVarZ = (znc) this.L$1;
                    jzb.q(obj);
                    if (zncVarZ == znc.FOLLOW_UP_ERROR) {
                        lpcVar2 = new lpc(new opc("QA fixture follow-up error"));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 5;
                        if (xj5Var.a(lpcVar2, this) != bw2Var) {
                            return bw2Var;
                        }
                        return wefVar;
                    }
                    seasonalReadingResponseA = ync.a(ync.a, this.$year, this.$solarTerm, null, null, this.$question, 12);
                    if (seasonalReadingResponseA != null) {
                        opcVar = new spc(seasonalReadingResponseA);
                    } else {
                        opcVar = new opc(null);
                    }
                    lpcVar = new lpc(opcVar);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 6;
                    if (xj5Var.a(lpcVar, this) != bw2Var) {
                        return bw2Var;
                    }
                    return wefVar;
                case 5:
                    jzb.q(obj);
                    return wefVar;
                case 6:
                    jzb.q(obj);
                    return wefVar;
                case 7:
                    jzb.q(obj);
                    mqc mqcVar2 = this.this$0.a;
                    int i13 = this.$year;
                    SolarTerm solarTerm6 = this.$solarTerm;
                    String str2 = this.$question;
                    this.L$0 = xj5Var;
                    this.L$1 = null;
                    this.label = 8;
                    rqc rqcVar2 = (rqc) mqcVar2;
                    js3 js3Var2 = ga4.a;
                    obj = ynb.p0(hr3.c, new oqc(rqcVar2, i13, solarTerm6, str2, null), this);
                    if (obj == bw2Var) {
                        serverResponse = (ServerResponse) obj;
                        if (serverResponse.getSuccess()) {
                            this.this$0.d().b("Seasonal followUp returned success=false: " + serverResponse.getErrorMessage());
                            errorMessage = serverResponse.getErrorMessage();
                            if (v4e.Q(errorMessage)) {
                                errorMessage = null;
                            }
                            lpcVar3 = new lpc(new opc(errorMessage));
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 10;
                            if (xj5Var.a(lpcVar3, this) != bw2Var) {
                                return wefVar;
                            }
                        } else {
                            this.L$0 = xj5Var;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 11;
                            if (xj5Var.a(mpcVar, this) != bw2Var) {
                                lqc lqcVar5 = this.this$0;
                                int i14 = this.$year;
                                SolarTerm solarTerm7 = this.$solarTerm;
                                this.L$0 = xj5Var;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 12;
                                int i15 = lqc.c;
                                obj = lqcVar5.a(i14, solarTerm7, this);
                                if (obj != bw2Var) {
                                    seasonalReadingResponse = (SeasonalReadingResponse) obj;
                                    if (seasonalReadingResponse != null) {
                                        followUps = seasonalReadingResponse.getFollowUps();
                                    } else {
                                        followUps = null;
                                    }
                                    if (followUps == null) {
                                        followUps = pu4.a;
                                    }
                                    int i16 = 0;
                                    if (followUps.isEmpty()) {
                                        i = 0;
                                    } else {
                                        it = followUps.iterator();
                                        i = 0;
                                        while (it.hasNext()) {
                                            answer = ((SeasonalFollowUp) it.next()).getAnswer();
                                            if (answer == null) {
                                            }
                                        }
                                    }
                                    if (!followUps.isEmpty()) {
                                        it2 = followUps.iterator();
                                        while (it2.hasNext()) {
                                            if (((SeasonalFollowUp) it2.next()).getStatus() != SeasonalStatus.ERROR) {
                                            }
                                        }
                                    }
                                    lqc lqcVar6 = this.this$0;
                                    int i17 = this.$year;
                                    SolarTerm solarTerm8 = this.$solarTerm;
                                    nx6 nx6Var2 = new nx6(i, i16, i3);
                                    int i18 = lqc.c;
                                    lqcVar6.getClass();
                                    cqcVar = new cqc(new ybc(new kqc(lqcVar6, i17, solarTerm8, nx6Var2, null)));
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.I$0 = i;
                                    this.I$1 = i16;
                                    this.label = 13;
                                    if (ok8.r(xj5Var, cqcVar, this) == bw2Var) {
                                        return wefVar;
                                    }
                                }
                            }
                        }
                    }
                    return bw2Var;
                case 8:
                    jzb.q(obj);
                    serverResponse = (ServerResponse) obj;
                    if (serverResponse.getSuccess()) {
                        this.this$0.d().b("Seasonal followUp returned success=false: " + serverResponse.getErrorMessage());
                        errorMessage = serverResponse.getErrorMessage();
                        if (v4e.Q(errorMessage)) {
                            errorMessage = null;
                        }
                        lpcVar3 = new lpc(new opc(errorMessage));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 10;
                        if (xj5Var.a(lpcVar3, this) != bw2Var) {
                            return wefVar;
                        }
                    } else {
                        this.L$0 = xj5Var;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 11;
                        if (xj5Var.a(mpcVar, this) != bw2Var) {
                            lqc lqcVar7 = this.this$0;
                            int i19 = this.$year;
                            SolarTerm solarTerm9 = this.$solarTerm;
                            this.L$0 = xj5Var;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 12;
                            int i110 = lqc.c;
                            obj = lqcVar7.a(i19, solarTerm9, this);
                            if (obj != bw2Var) {
                                seasonalReadingResponse = (SeasonalReadingResponse) obj;
                                if (seasonalReadingResponse != null) {
                                    followUps = seasonalReadingResponse.getFollowUps();
                                } else {
                                    followUps = null;
                                }
                                if (followUps == null) {
                                    followUps = pu4.a;
                                }
                                int i111 = 0;
                                if (followUps.isEmpty()) {
                                    i = 0;
                                } else {
                                    it = followUps.iterator();
                                    i = 0;
                                    while (it.hasNext()) {
                                        answer = ((SeasonalFollowUp) it.next()).getAnswer();
                                        if (answer == null) {
                                        }
                                    }
                                }
                                if (!followUps.isEmpty()) {
                                    it2 = followUps.iterator();
                                    while (it2.hasNext()) {
                                        if (((SeasonalFollowUp) it2.next()).getStatus() != SeasonalStatus.ERROR) {
                                        }
                                    }
                                }
                                lqc lqcVar8 = this.this$0;
                                int i112 = this.$year;
                                SolarTerm solarTerm10 = this.$solarTerm;
                                nx6 nx6Var3 = new nx6(i, i111, i3);
                                int i113 = lqc.c;
                                lqcVar8.getClass();
                                cqcVar = new cqc(new ybc(new kqc(lqcVar8, i112, solarTerm10, nx6Var3, null)));
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.I$0 = i;
                                this.I$1 = i111;
                                this.label = 13;
                                if (ok8.r(xj5Var, cqcVar, this) == bw2Var) {
                                    return wefVar;
                                }
                            }
                        }
                    }
                    return bw2Var;
                case 9:
                    jzb.q(obj);
                    return wefVar;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    jzb.q(obj);
                    return wefVar;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                    jzb.q(obj);
                    lqc lqcVar9 = this.this$0;
                    int i114 = this.$year;
                    SolarTerm solarTerm11 = this.$solarTerm;
                    this.L$0 = xj5Var;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 12;
                    int i115 = lqc.c;
                    obj = lqcVar9.a(i114, solarTerm11, this);
                    if (obj != bw2Var) {
                        seasonalReadingResponse = (SeasonalReadingResponse) obj;
                        if (seasonalReadingResponse != null) {
                            followUps = seasonalReadingResponse.getFollowUps();
                        } else {
                            followUps = null;
                        }
                        if (followUps == null) {
                            followUps = pu4.a;
                        }
                        int i116 = 0;
                        if (followUps.isEmpty()) {
                            i = 0;
                        } else {
                            it = followUps.iterator();
                            i = 0;
                            while (it.hasNext()) {
                                answer = ((SeasonalFollowUp) it.next()).getAnswer();
                                if (answer == null) {
                                }
                            }
                        }
                        if (!followUps.isEmpty()) {
                            it2 = followUps.iterator();
                            while (it2.hasNext()) {
                                if (((SeasonalFollowUp) it2.next()).getStatus() != SeasonalStatus.ERROR) {
                                }
                            }
                        }
                        lqc lqcVar10 = this.this$0;
                        int i117 = this.$year;
                        SolarTerm solarTerm12 = this.$solarTerm;
                        nx6 nx6Var4 = new nx6(i, i116, i3);
                        int i118 = lqc.c;
                        lqcVar10.getClass();
                        cqcVar = new cqc(new ybc(new kqc(lqcVar10, i117, solarTerm12, nx6Var4, null)));
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.I$0 = i;
                        this.I$1 = i116;
                        this.label = 13;
                        if (ok8.r(xj5Var, cqcVar, this) == bw2Var) {
                            return wefVar;
                        }
                    }
                    return bw2Var;
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    jzb.q(obj);
                    seasonalReadingResponse = (SeasonalReadingResponse) obj;
                    if (seasonalReadingResponse != null) {
                        followUps = seasonalReadingResponse.getFollowUps();
                    } else {
                        followUps = null;
                    }
                    if (followUps == null) {
                        followUps = pu4.a;
                    }
                    int i119 = 0;
                    if (followUps.isEmpty()) {
                        i = 0;
                    } else {
                        it = followUps.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            answer = ((SeasonalFollowUp) it.next()).getAnswer();
                            if (answer == null) {
                            }
                        }
                    }
                    if (!followUps.isEmpty()) {
                        it2 = followUps.iterator();
                        while (it2.hasNext()) {
                            if (((SeasonalFollowUp) it2.next()).getStatus() != SeasonalStatus.ERROR) {
                            }
                        }
                    }
                    lqc lqcVar11 = this.this$0;
                    int i1110 = this.$year;
                    SolarTerm solarTerm13 = this.$solarTerm;
                    nx6 nx6Var5 = new nx6(i, i119, i3);
                    int i1111 = lqc.c;
                    lqcVar11.getClass();
                    cqcVar = new cqc(new ybc(new kqc(lqcVar11, i1110, solarTerm13, nx6Var5, null)));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.I$0 = i;
                    this.I$1 = i119;
                    this.label = 13;
                    if (ok8.r(xj5Var, cqcVar, this) == bw2Var) {
                        return bw2Var;
                    }
                    return wefVar;
                case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    jzb.q(obj);
                    return wefVar;
                default:
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Exception e) {
            ynb.h0(e);
            this.this$0.d().c("Failed to submit seasonal follow-up", e);
            this.this$0.getClass();
            lpc lpcVar7 = new lpc(lqc.i(e));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 9;
            if (xj5Var.a(lpcVar7, this) == bw2Var) {
                return bw2Var;
            }
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((dqc) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
