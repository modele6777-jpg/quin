package defpackage;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.conversation.FailReason;
import ai.askquin.ui.conversation.Operation;
import java.time.Instant;
import java.util.List;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.SpreadRecommendationResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j13 {
    public static final j13 a = new j13();

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(nb4 nb4Var, String str, Instant instant, zn2 zn2Var) {
        i13 i13Var;
        String strD;
        yc4 yc4Var;
        if (zn2Var instanceof i13) {
            i13Var = (i13) zn2Var;
            int i = i13Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                i13Var.label = i - Integer.MIN_VALUE;
            } else {
                i13Var = new i13(this, zn2Var);
            }
        } else {
            i13Var = new i13(this, zn2Var);
        }
        Object obj = i13Var.result;
        int i2 = i13Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            str.getClass();
            instant.getClass();
            fb4 fb4Var = new fb4(hd4.a, t72.H(new ct8("CursorWindow probe row", null)), (Operation) null, (FailReason) null, (Operation) null, (List) null, (QuotaBlockReason) null, (cm4) null, 480);
            List listH = t72.H(new SpreadRecommendationResult("cursor-window-large-ai", t72.H(new PatternData("Probe", "CursorWindow oversized row")), "CursorWindow Large Field Probe", c5e.y(4194304, "x"), true, 1));
            yc4 yc4Var2 = new yc4("cursor-window-large-ai-debug-probe", false, instant, instant, instant, "CursorWindow Large Field Probe", 1, fb4Var, false, null, null, "debug-cursor-window", null, listH, 0, null, null, str, null, 3411968);
            dd0 dd0Var = ki.a;
            strD = fzc.a.d(ki.a, listH);
            i13Var.L$0 = null;
            i13Var.L$1 = null;
            i13Var.L$2 = null;
            i13Var.L$3 = yc4Var2;
            i13Var.L$4 = strD;
            i13Var.label = 1;
            Object objG = ((vb4) nb4Var).g(yc4Var2, i13Var);
            bw2 bw2Var = bw2.a;
            if (objG == bw2Var) {
                return bw2Var;
            }
            yc4Var = yc4Var2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            strD = (String) i13Var.L$4;
            yc4Var = (yc4) i13Var.L$3;
            jzb.q(obj);
        }
        String str2 = yc4Var.a;
        String str3 = yc4Var.r;
        byte[] bytes = strD.getBytes(ox1.a);
        bytes.getClass();
        return new h13(str2, str3, bytes.length);
    }
}
