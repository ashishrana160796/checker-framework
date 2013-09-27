package checkers.util.report;

import javax.annotation.processing.SupportedOptions;

import checkers.basetype.BaseTypeChecker;
import checkers.quals.TypeQualifiers;
import checkers.quals.Unqualified;
import checkers.types.BasicAnnotatedTypeFactory;

/**
 * The Report Checker for semantic searches.
 * <p>
 * 
 * See the qualifiers for documentation.
 * <p>
 *
 * Options:
 * reportTreeKinds: comma-separated list of Tree.Kinds that should be reported.
 *
 */
@TypeQualifiers({ Unqualified.class })
@SupportedOptions({"reportTreeKinds", "reportModifiers"})
public class ReportChecker extends BaseTypeChecker<BasicAnnotatedTypeFactory<ReportChecker>> {}
