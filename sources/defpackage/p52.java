package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p52 implements d3b {
    public final u79 a;
    public final List b;

    public p52(u79 u79Var) {
        this.a = u79Var;
        ParamSpec paramSpec = new ParamSpec("iso", ParamType.STRING, false, (nh7) null, 8, (rp3) null);
        ParamType paramType = ParamType.INT;
        this.b = t72.I(paramSpec, new ParamSpec("epochMillis", paramType, false, (nh7) null, 8, (rp3) null), new ParamSpec("offsetDays", paramType, false, (nh7) null, 8, (rp3) null));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        Long lValueOf;
        String strC;
        Object dzbVar;
        nh7 nh7Var = (nh7) ti7Var.get("epochMillis");
        if (nh7Var != null) {
            try {
                lValueOf = Long.valueOf(oh7.j(oh7.i(nh7Var)));
            } catch (lh7 e) {
                throw new NumberFormatException(e.getMessage());
            }
        } else {
            nh7 nh7Var2 = (nh7) ti7Var.get("iso");
            if (nh7Var2 == null || (strC = oh7.i(nh7Var2).c()) == null) {
                nh7 nh7Var3 = (nh7) ti7Var.get("offsetDays");
                if (nh7Var3 != null) {
                    lValueOf = Long.valueOf((((long) oh7.f(oh7.i(nh7Var3))) * 86400000) + System.currentTimeMillis());
                } else {
                    lValueOf = null;
                }
            } else {
                try {
                    dzbVar = LocalDateTime.parse(strC);
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                if (dzbVar instanceof dzb) {
                    dzbVar = null;
                }
                LocalDateTime localDateTime = (LocalDateTime) dzbVar;
                if (localDateTime == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
                }
            }
        }
        if (lValueOf == null) {
            return new QaResult.Err("provide one of 'epochMillis', 'iso', or 'offsetDays'", "invalid_params");
        }
        long jLongValue = lValueOf.longValue();
        u79 u79Var = this.a;
        u79Var.d(jLongValue);
        return new QaResult.Ok(tm7.z(u79Var));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "clock.set";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "把 App 时钟设到指定时刻（不改系统时间）";
    }
}
