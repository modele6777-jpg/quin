package defpackage;

import tech.chatmind.api.Message;
import tech.chatmind.api.Role;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bt8 implements w56 {
    public static final bt8 a;
    private static final nyc descriptor;

    static {
        bt8 bt8Var = new bt8();
        a = bt8Var;
        gia giaVar = new gia("tech.chatmind.api.Message", bt8Var, 2);
        giaVar.k("role", false);
        giaVar.k("content", false);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        Message message = (Message) obj;
        message.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        Message.write$Self$Quin_core_base_api_release(message, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = Message.$childSerializers;
        xyc xycVar = null;
        boolean z = true;
        int i = 0;
        Role role = null;
        String strO = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            if (iJ == -1) {
                z = false;
            } else if (iJ == 0) {
                role = (Role) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), role);
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
        return new Message(i, role, strO, xycVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        return new xn7[]{Message.$childSerializers[0].getValue(), p4e.a};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
