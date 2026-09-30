package defpackage;

import ai.askquin.model.Scene;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uec implements w56 {
    public static final uec a;
    private static final nyc descriptor;

    static {
        uec uecVar = new uec();
        a = uecVar;
        gia giaVar = new gia("ai.askquin.model.Scene", uecVar, 8);
        giaVar.k("category", false);
        giaVar.k("darkImageURL", false);
        giaVar.k("guessQuestions", false);
        giaVar.k("id", false);
        giaVar.k("imageURL", false);
        giaVar.k("spreadKey", false);
        giaVar.k("subTitle", false);
        giaVar.k("title", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        Scene scene = (Scene) obj;
        scene.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        Scene.write$Self$Quin_core_model(scene, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = Scene.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        String strO = null;
        String strO2 = null;
        List list = null;
        String strO3 = null;
        String strO4 = null;
        String strO5 = null;
        String strO6 = null;
        String strO7 = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strO = zf2VarC.o(nycVar, 0);
                    i |= 1;
                    break;
                case 1:
                    strO2 = zf2VarC.o(nycVar, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) zf2VarC.s(nycVar, 2, (xn7) lw7VarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    strO3 = zf2VarC.o(nycVar, 3);
                    i |= 8;
                    continue;
                case 4:
                    strO4 = zf2VarC.o(nycVar, 4);
                    i |= 16;
                    continue;
                case 5:
                    strO5 = zf2VarC.o(nycVar, 5);
                    i |= 32;
                    continue;
                case 6:
                    strO6 = zf2VarC.o(nycVar, 6);
                    i |= 64;
                    continue;
                case 7:
                    strO7 = zf2VarC.o(nycVar, 7);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    continue;
                default:
                    s8f.f(iJ);
                    return obj;
            }
            obj = null;
        }
        zf2VarC.b(nycVar);
        return new Scene(i, strO, strO2, list, strO3, strO4, strO5, strO6, strO7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = Scene.$childSerializers;
        p4e p4eVar = p4e.a;
        return new xn7[]{p4eVar, p4eVar, lw7VarArr[2].getValue(), p4eVar, p4eVar, p4eVar, p4eVar, p4eVar};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
