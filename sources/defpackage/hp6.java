package defpackage;

import ai.askquin.R;
import ai.askquin.model.Scene;
import java.util.List;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.dto.ScenarioPattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hp6 extends gbe implements l26 {
    final /* synthetic */ jr2 $conversationLauncher;
    final /* synthetic */ Scene $scene;
    int label;
    final /* synthetic */ kq6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp6(kq6 kq6Var, jr2 jr2Var, Scene scene, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = kq6Var;
        this.$conversationLauncher = jr2Var;
        this.$scene = scene;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new hp6(this.this$0, this.$conversationLauncher, this.$scene, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                this.this$0.O0.setValue(Boolean.TRUE);
                js3 js3Var = ga4.a;
                hr3 hr3Var = hr3.c;
                gp6 gp6Var = new gp6(this.this$0, this.$scene, null);
                this.label = 1;
                obj = ynb.p0(hr3Var, gp6Var, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            ScenarioPattern scenarioPattern = (ScenarioPattern) obj;
            this.this$0.O0.setValue(Boolean.FALSE);
            if (scenarioPattern == null) {
                kv2.u(R.string.network_common_error, 0);
            } else {
                jr2 jr2Var = this.$conversationLauncher;
                String title = this.$scene.getTitle();
                List<String> guessQuestions = this.$scene.getGuessQuestions();
                String pattern = scenarioPattern.getPattern();
                List<PatternData> patternData = scenarioPattern.getPatternData();
                String id = this.$scene.getId();
                String spreadKey = this.$scene.getSpreadKey();
                jr2Var.getClass();
                title.getClass();
                guessQuestions.getClass();
                pattern.getClass();
                patternData.getClass();
                jr2Var.b.h(new hr2(title, pattern, id, spreadKey, guessQuestions, patternData));
                jr2Var.b();
            }
            return wef.a;
        } catch (Throwable th) {
            this.this$0.O0.setValue(Boolean.FALSE);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((hp6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
