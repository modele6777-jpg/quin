package defpackage;

import tech.chatmind.api.ReadingFeedbackTag;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class efb implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ ReadingFeedbackTag c;

    public /* synthetic */ efb(a26 a26Var, ReadingFeedbackTag readingFeedbackTag, int i) {
        this.a = i;
        this.b = a26Var;
        this.c = readingFeedbackTag;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        ReadingFeedbackTag readingFeedbackTag = this.c;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                a26Var.d(readingFeedbackTag);
                break;
            default:
                a26Var.d(readingFeedbackTag);
                break;
        }
        return wefVar;
    }
}
