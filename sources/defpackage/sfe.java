package defpackage;

import ai.askquin.R;
import ai.askquin.model.Scene;
import ai.askquin.repository.b;
import android.content.Context;
import java.util.Iterator;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.ScenarioPatternRequest;
import tech.chatmind.api.dto.ScenarioPattern;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sfe implements xt6 {
    public final t7 a;
    public final i2a b;
    public final b c;
    public final lfe d;
    public final vab e;

    public sfe(t7 t7Var, i2a i2aVar, b bVar, lfe lfeVar, vab vabVar) {
        this.a = t7Var;
        this.b = i2aVar;
        this.c = bVar;
        this.d = lfeVar;
        this.e = vabVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, zn2 zn2Var) {
        pfe pfeVar;
        Object next;
        Context context;
        if (zn2Var instanceof pfe) {
            pfeVar = (pfe) zn2Var;
            int i = pfeVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pfeVar.label = i - Integer.MIN_VALUE;
            } else {
                pfeVar = new pfe(this, zn2Var);
            }
        } else {
            pfeVar = new pfe(this, zn2Var);
        }
        Object objA = pfeVar.result;
        int i2 = pfeVar.label;
        try {
            if (i2 == 0) {
                jzb.q(objA);
                if (pa7.t(str2, "yes-or-no")) {
                    Iterator it = this.c.c().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!pa7.t(((Scene) next).getId(), "yes-or-no"));
                    Scene scene = (Scene) next;
                    if (scene != null && (context = cn1.P0) != null) {
                        String string = context.getString(R.string.single_card_position_desc);
                        string.getClass();
                        return new ScenarioPattern(scene.getTitle(), t72.H(new PatternData(scene.getTitle(), string)));
                    }
                } else {
                    lfe lfeVar = this.d;
                    ScenarioPatternRequest scenarioPatternRequest = new ScenarioPatternRequest(str, str2, (String) null, 4, (rp3) null);
                    pfeVar.L$0 = null;
                    pfeVar.L$1 = null;
                    pfeVar.label = 1;
                    objA = lfeVar.a(scenarioPatternRequest, pfeVar);
                    bw2 bw2Var = bw2.a;
                    if (objA == bw2Var) {
                        return bw2Var;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objA);
            ServerResponse serverResponse = (ServerResponse) objA;
            if (serverResponse.getSuccess()) {
                return (ScenarioPattern) serverResponse.getData();
            }
            return null;
        } catch (Exception e) {
            ynb.h0(e);
            ef8 ef8Var = hf8.Q;
            String name = sfe.class.getName();
            ef8Var.getClass();
            ef8.a(name).c("Generate Scene pattern error", e);
            return null;
        }
    }
}
