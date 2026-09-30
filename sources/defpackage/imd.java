package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.skin.download.SkinDownloadWorker;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class imd extends gbe implements l26 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ SkinDownloadWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imd(SkinDownloadWorker skinDownloadWorker, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = skinDownloadWorker;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new imd(this.this$0, xn2Var);
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x02fd: INVOKE (r1 I:java.lang.String) = (r6 I:java.lang.Enum) VIRTUAL call: java.lang.Enum.name():java.lang.String A[MD:():java.lang.String (c)] (LINE:766), block:B:73:0x02f9 */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x032d: INVOKE (r2 I:java.lang.String) = (r6 I:java.lang.Enum) VIRTUAL call: java.lang.Enum.name():java.lang.String A[MD:():java.lang.String (c)] (LINE:814), block:B:74:0x0329 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum] */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Exception {
        ?? Name;
        ?? Name2;
        Object next;
        TarotSkinIdentify tarotSkinIdentify;
        int i;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                this.this$0.d().e("=== SkinDownloadWorker.doWork() started ===");
                String strD = this.this$0.b.b.d("skin_folder");
                if (strD == null) {
                    iy9[] iy9VarArr = {new iy9("error", "Missing skin folder")};
                    kb6 kb6Var = new kb6(11);
                    iy9 iy9Var = iy9VarArr[0];
                    kb6Var.o(iy9Var.e(), (String) iy9Var.d());
                    r88 r88Var = new r88(kb6Var.i());
                    this.this$0.d().b("Missing skin folder in input data");
                    return r88Var;
                }
                this.this$0.d().e("Skin folder from input: ".concat(strD));
                Iterator<E> it = TarotSkinIdentify.getEntries().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!pa7.t(((TarotSkinIdentify) next).getFolder(), strD));
                tarotSkinIdentify = (TarotSkinIdentify) next;
                if (tarotSkinIdentify == null) {
                    iy9[] iy9VarArr2 = {new iy9("error", "Unknown skin: ".concat(strD))};
                    kb6 kb6Var2 = new kb6(11);
                    iy9 iy9Var2 = iy9VarArr2[0];
                    kb6Var2.o(iy9Var2.e(), (String) iy9Var2.d());
                    r88 r88Var2 = new r88(kb6Var2.i());
                    this.this$0.d().b("Unknown skin: ".concat(strD));
                    return r88Var2;
                }
                this.this$0.d().e("Starting download for skin: " + tarotSkinIdentify.name());
                kmd kmdVar = (kmd) this.this$0.v.getValue();
                kmdVar.getClass();
                File file = new File(new File(kmdVar.a.getFilesDir(), "tarot-skins"), tarotSkinIdentify.getFolder());
                this.this$0.d().e("Target directory: " + file.getAbsolutePath());
                file.mkdirs();
                ca2.a.getClass();
                String str = (ca2.c ? "https://assets.quin.love" : "https://assets.quinlove.cn") + "/tarot-skins/" + strD + ".zip";
                File file2 = new File(this.this$0.a.getCacheDir(), "skin_" + strD + ".zip.part");
                this.this$0.d().e("Download URL: " + str + " (resume from " + file2.length() + " bytes)");
                SkinDownloadWorker skinDownloadWorker = this.this$0;
                h6b h6bVar = new h6b(27, skinDownloadWorker, tarotSkinIdentify);
                this.L$0 = null;
                this.L$1 = tarotSkinIdentify;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                skinDownloadWorker.getClass();
                js3 js3Var = ga4.a;
                Object objP0 = ynb.p0(hr3.c, new jmd(skinDownloadWorker, str, file2, file, h6bVar, null), this);
                Object obj2 = bw2.a;
                if (objP0 != obj2) {
                    objP0 = wef.a;
                }
                if (objP0 == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tarotSkinIdentify = (TarotSkinIdentify) this.L$1;
                jzb.q(obj);
            }
            SkinDownloadWorker skinDownloadWorker2 = this.this$0;
            int i3 = SkinDownloadWorker.x;
            boolean zB = ((kmd) skinDownloadWorker2.v.getValue()).b(tarotSkinIdentify);
            SkinDownloadWorker skinDownloadWorker3 = this.this$0;
            if (zB) {
                skinDownloadWorker3.d().e("Skin " + tarotSkinIdentify.name() + " downloaded successfully");
                return new t88();
            }
            kmd kmdVar2 = (kmd) skinDownloadWorker3.v.getValue();
            kmdVar2.getClass();
            if (tarotSkinIdentify.getRequiresDownload()) {
                lx4 entries = TarotCardType.getEntries();
                if (entries == null || !entries.isEmpty()) {
                    Iterator<E> it2 = entries.iterator();
                    int i4 = 0;
                    while (it2.hasNext()) {
                        if (iec.l(kmdVar2.a(tarotSkinIdentify, ((TarotCardType) it2.next()).getCardKey())) && (i4 = i4 + 1) < 0) {
                            t72.Y();
                            throw null;
                        }
                    }
                    i = i4;
                } else {
                    i = 0;
                }
            } else {
                i = 78;
            }
            String str2 = "Incomplete download: " + i + "/78 cards";
            this.this$0.d().b(str2);
            iy9[] iy9VarArr3 = {new iy9("error", str2)};
            kb6 kb6Var3 = new kb6(11);
            iy9 iy9Var3 = iy9VarArr3[0];
            kb6Var3.o(iy9Var3.e(), (String) iy9Var3.d());
            return new r88(kb6Var3.i());
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                throw e;
            }
            if (arb.m(e)) {
                iy9[] iy9VarArr4 = {new iy9("error", "storage_full")};
                kb6 kb6Var4 = new kb6(11);
                iy9 iy9Var4 = iy9VarArr4[0];
                kb6Var4.o(iy9Var4.e(), (String) iy9Var4.d());
                return new r88(kb6Var4.i());
            }
            SkinDownloadWorker skinDownloadWorker4 = this.this$0;
            if (skinDownloadWorker4.b.c < 1) {
                skinDownloadWorker4.d().h("Download failed for skin " + Name2.name() + " (attempt " + this.this$0.b.c + "), retrying", e);
                return new s88();
            }
            skinDownloadWorker4.d().c("Download failed for skin " + Name.name() + " after " + this.this$0.b.c + " retries", e);
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            iy9[] iy9VarArr5 = {new iy9("error", message)};
            kb6 kb6Var5 = new kb6(11);
            iy9 iy9Var5 = iy9VarArr5[0];
            kb6Var5.o(iy9Var5.e(), (String) iy9Var5.d());
            return new r88(kb6Var5.i());
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((imd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
