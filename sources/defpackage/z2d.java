package defpackage;

import ai.askquin.qa.bridge.Danger;
import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import ai.askquin.qa.capabilities.seasonal.SeasonalQaFixtureState;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z2d implements d3b {
    public final rw5 a;
    public final Danger b = Danger.STAGING_ONLY;
    public final List c;

    static {
        int i = rw5.f;
    }

    public z2d(rw5 rw5Var) {
        this.a = rw5Var;
        ParamType paramType = ParamType.STRING;
        this.c = t72.I(new ParamSpec("fixture", paramType, true, (nh7) null, 8, (rp3) null), new ParamSpec("status", paramType, true, (nh7) null, 8, (rp3) null), new ParamSpec("resultScenario", paramType, true, (nh7) null, 8, (rp3) null));
    }

    @Override // defpackage.d3b
    public final Danger b() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        String strC;
        String strC2;
        String strC3;
        nh7 nh7Var = (nh7) ti7Var.get("fixture");
        SeasonalQaFixtureState seasonalQaFixtureState = null;
        if (nh7Var != null) {
            yi7 yi7VarI = oh7.i(nh7Var);
            if (yi7VarI instanceof qi7) {
                strC = null;
            } else {
                strC = yi7VarI.c();
            }
        } else {
            strC = null;
        }
        if (strC == null) {
            strC = "";
        }
        nh7 nh7Var2 = (nh7) ti7Var.get("status");
        if (nh7Var2 != null) {
            yi7 yi7VarI2 = oh7.i(nh7Var2);
            if (yi7VarI2 instanceof qi7) {
                strC2 = null;
            } else {
                strC2 = yi7VarI2.c();
            }
        } else {
            strC2 = null;
        }
        if (strC2 == null) {
            strC2 = "";
        }
        nh7 nh7Var3 = (nh7) ti7Var.get("resultScenario");
        if (nh7Var3 != null) {
            yi7 yi7VarI3 = oh7.i(nh7Var3);
            if (yi7VarI3 instanceof qi7) {
                strC3 = null;
            } else {
                strC3 = yi7VarI3.c();
            }
        } else {
            strC3 = null;
        }
        String str = strC3 != null ? strC3 : "";
        qnc.a.getClass();
        qnc qncVarQ = y25.q(strC);
        if (qncVarQ == null) {
            return new QaResult.Err(ib8.j("unsupported fixture '", strC, "'"), "invalid_params");
        }
        wnc.a.getClass();
        wnc wncVarF = eu4.f(strC2);
        if (wncVarF == null) {
            return new QaResult.Err(ib8.j("unsupported status '", strC2, "'"), "invalid_params");
        }
        znc.a.getClass();
        znc zncVarK = yx4.k(str);
        if (zncVarK == null) {
            return new QaResult.Err(ib8.j("unsupported resultScenario '", str, "'"), "invalid_params");
        }
        if (!t72.I("https://quin.love", "https://quinlove.cn", "https://askquin.ai", "https://askquin.cn").contains("https://quin.love")) {
            SeasonalQaFixtureState seasonalQaFixtureState2 = new SeasonalQaFixtureState(qncVarQ.b(), wncVarF.a(), zncVarK.a());
            bm8.P(new tnc(seasonalQaFixtureState2, null));
            seasonalQaFixtureState = seasonalQaFixtureState2;
        }
        if (seasonalQaFixtureState == null) {
            return new QaResult.Err("seasonal QA fixtures are disabled against production", "production_blocked");
        }
        this.a.e(qncVarQ.d());
        return new QaResult.Ok(q1c.j(seasonalQaFixtureState));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "seasonal.fixture.set";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.c;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "设置四季牌阵 QA fixture（活动、权益与结果场景）";
    }
}
