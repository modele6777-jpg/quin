package defpackage;

import tech.chatmind.api.SpreadRecommendationResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ywd {
    public static final z67 a = new z67(1, 5, 1);

    public static final mi a(SpreadRecommendationResult spreadRecommendationResult) {
        spreadRecommendationResult.getClass();
        return b(spreadRecommendationResult.getPatternData().size());
    }

    public static final mi b(int i) {
        z67 z67Var = a;
        return (i > z67Var.b || z67Var.a > i) ? mi.ADVANCED : mi.BASIC;
    }
}
