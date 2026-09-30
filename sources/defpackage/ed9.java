package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ed9 implements d3b {
    public final List a;

    public ed9() {
        ParamType paramType = ParamType.STRING;
        this.a = t72.I(new ParamSpec("endpoint", paramType, true, (nh7) null, 8, (rp3) null), new ParamSpec("code", ParamType.INT, true, (nh7) null, 8, (rp3) null), new ParamSpec("body", ParamType.JSON, false, (nh7) null, 8, (rp3) null), new ParamSpec("contentType", paramType, false, (nh7) null, 8, (rp3) null));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0094  */
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        String string;
        String string2;
        String str;
        nh7 nh7Var = (nh7) ti7Var.get("endpoint");
        if (nh7Var != null) {
            yi7 yi7VarI = oh7.i(nh7Var);
            String strC = yi7VarI instanceof qi7 ? null : yi7VarI.c();
            if (strC != null && (string = v4e.o0(strC).toString()) != null) {
                if (string.length() == 0) {
                    return new QaResult.Err("blank 'endpoint'", "invalid_params");
                }
                nh7 nh7Var2 = (nh7) ti7Var.get("code");
                if (nh7Var2 == null) {
                    return new QaResult.Err("missing/invalid 'code'", "invalid_params");
                }
                int iF = oh7.f(oh7.i(nh7Var2));
                nh7 nh7Var3 = (nh7) ti7Var.get("body");
                if (nh7Var3 != null) {
                    yi7 yi7Var = nh7Var3 instanceof yi7 ? (yi7) nh7Var3 : null;
                    string2 = (yi7Var == null || !yi7Var.d()) ? nh7Var3.toString() : yi7Var.c();
                } else {
                    string2 = null;
                }
                nh7 nh7Var4 = (nh7) ti7Var.get("contentType");
                if (nh7Var4 != null) {
                    yi7 yi7VarI2 = oh7.i(nh7Var4);
                    String strC2 = yi7VarI2 instanceof qi7 ? null : yi7VarI2.c();
                    if (strC2 == null) {
                        str = "application/json";
                    } else {
                        str = v4e.Q(strC2) ? null : strC2;
                        if (str == null) {
                            str = "application/json";
                        }
                    }
                } else {
                    str = "application/json";
                }
                boolean z = jd9.a;
                jd9.c.put(string, new fd9(iF, string2, str));
                LinkedHashMap linkedHashMapI = bm8.I(new iy9("endpoint", oh7.c(string)), new iy9("code", oh7.b(Integer.valueOf(iF))));
                if (string2 != null) {
                    linkedHashMapI.put("body", oh7.c(string2));
                }
                linkedHashMapI.put("contentType", oh7.c(str));
                return new QaResult.Ok(new ti7(linkedHashMapI));
            }
        }
        return new QaResult.Err("missing 'endpoint'", "invalid_params");
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "env.net-sim.fail";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.a;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "强制某 endpoint 返回指定 HTTP 状态码";
    }
}
