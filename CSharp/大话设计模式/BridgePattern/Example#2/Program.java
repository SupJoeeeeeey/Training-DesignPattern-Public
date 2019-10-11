/**
 * 实现化(Implementor)角色
 */
public interface ExportWay {
    void export(String requirement);
}
/**
 * 具体实现化(ConcreteImplementor)角色
 */
public class EmailExport implements ExportWay {
    @Override
    public void export(String requirement) {
        System.out.println("通过邮件导出需求:" + requirement);
    }
}
/**
 * 具体实现化(ConcreteImplementor)角色
 */
public class DownloadExport implements ExportWay {
    @Override
    public void export(String requirement) {
        System.out.println("通过直接下载导出需求:" + requirement);
    }
}
/**
 * 具体实现化(ConcreteImplementor)角色
 */
public class EmailExport implements ExportWay {
    @Override
    public void export(String requirement) {
        System.out.println("通过邮件导出需求:" + requirement);
    }
}

/**
 * 抽象化(Abstraction)角色
 */
public abstract class ExportRequirement {
   /**
    *  持有一个实现部分的对象
    */
    private ExportWay exportWay;

    public ExportRequirement(ExportWay exportWay) {
        this.exportWay = exportWay;
    }

    public void exportFormat(String requirement) {
        this.exportWay.export(requirement);
    }
}
/**
 * 修正抽象化(RefinedAbstraction)角色
 */
public class PdfFormat extends ExportRequirement {
    public PdfFormat(ExportWay exportWay) {
        super(exportWay);
    }

    @Override
    public void exportFormat(String requirement) {
        System.out.println("导出PDF格式的需求");
        super.exportFormat(requirement);
    }
}
/**
 * 修正抽象化(RefinedAbstraction)角色
 */
public class WordFormat extends ExportRequirement{
    public WordFormat(ExportWay exportWay) {
        super(exportWay);
    }

    @Override
    public void exportFormat(String requirement) {
        System.out.println("导出word格式的需求");
        super.exportFormat(requirement);
    }
}
/**
 * 修正抽象化(RefinedAbstraction)角色
 */
public class ExcelFormat extends ExportRequirement {
    public ExcelFormat(ExportWay exportWay) {
        super(exportWay);
    }

    @Override
    public void exportFormat(String requirement) {
        System.out.println("导出excel格式的需求");
        super.exportFormat(requirement);
    }
}