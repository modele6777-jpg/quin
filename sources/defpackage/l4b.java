package defpackage;

import tech.chatmind.api.Question;
import tech.chatmind.api.TemplateCategory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l4b implements w56 {
    public static final l4b a;
    private static final nyc descriptor;

    static {
        l4b l4bVar = new l4b();
        a = l4bVar;
        gia giaVar = new gia("tech.chatmind.api.Question", l4bVar, 2);
        giaVar.k("category", true);
        giaVar.k("question", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        Question question = (Question) obj;
        question.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        Question.write$Self$Quin_core_base_api_release(question, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = Question.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        TemplateCategory templateCategory = null;
        String strO = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                templateCategory = (TemplateCategory) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), templateCategory);
                i |= 1;
            } else {
                if (iJ != 1) {
                    s8f.f(iJ);
                    return null;
                }
                strO = zf2VarC.o(nycVar, 1);
                i |= 2;
            }
        }
        zf2VarC.b(nycVar);
        return new Question(i, templateCategory, strO, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{Question.$childSerializers[0].getValue(), p4e.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
