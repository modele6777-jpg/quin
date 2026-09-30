package defpackage;

import ai.askquin.qa.bridge.Danger;
import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uy8 implements d3b {
    public final q9b a;
    public final Danger b = Danger.STAGING_ONLY;
    public final List c = t72.H(new ParamSpec("type", ParamType.STRING, true, (nh7) null, 8, (rp3) null));

    public uy8(q9b q9bVar) {
        this.a = q9bVar;
    }

    @Override // defpackage.d3b
    public final Danger b() {
        return this.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0  */
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        Object dzbVar;
        String strName;
        nh7 nh7Var = (nh7) ti7Var.get("type");
        if (nh7Var != null) {
            yi7 yi7VarI = oh7.i(nh7Var);
            String strC = yi7VarI instanceof qi7 ? null : yi7VarI.c();
            if (strC != null) {
                q9b q9bVar = this.a;
                eab eabVar = q9bVar instanceof eab ? (eab) q9bVar : null;
                if (eabVar == null) {
                    return new QaResult.Err("QuotaProvider is not QuotaProviderImpl", "unsupported");
                }
                String lowerCase = v4e.o0(strC).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String str = "none";
                switch (lowerCase) {
                    case "supreme":
                        dzbVar = u7e.v;
                        break;
                    case "quarterly":
                        dzbVar = u7e.d;
                        break;
                    case "yearly":
                        dzbVar = u7e.c;
                        break;
                    case "max":
                        dzbVar = u7e.v;
                        break;
                    case "pro":
                        dzbVar = u7e.y;
                        break;
                    case "v4m":
                        dzbVar = u7e.b;
                        break;
                    case "v4q":
                        dzbVar = u7e.d;
                        break;
                    case "v4y":
                        dzbVar = u7e.c;
                        break;
                    case "还原":
                    case "none":
                    case "null":
                        dzbVar = null;
                        break;
                    case "basic":
                        dzbVar = u7e.Y;
                        break;
                    case "clear":
                        dzbVar = null;
                        break;
                    case "monthly":
                        dzbVar = u7e.b;
                        break;
                    default:
                        dzbVar = new dzb(new IllegalArgumentException(strC));
                        break;
                }
                boolean z = dzbVar instanceof dzb;
                if (z) {
                    return new QaResult.Err(ib8.j("invalid type '", strC, "'; expected none/basic/pro/max/v4y/v4q/v4m"), "invalid_params");
                }
                u7e u7eVar = (u7e) (z ? null : dzbVar);
                eabVar.h(u7eVar);
                if (u7eVar != null && (strName = u7eVar.name()) != null) {
                    str = strName;
                }
                return new QaResult.Ok(new ti7(ib8.q("type", oh7.c(str))));
            }
        }
        return new QaResult.Err("missing required param 'type'", "invalid_params");
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "account.mock-subscription";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.c;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "本地 mock 订阅档位（none/basic/pro/max/v4y/v4q/v4m）";
    }
}
