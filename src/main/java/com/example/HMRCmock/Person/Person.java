package com.example.HMRCmock.Person;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table
public class Person {
    @Id
    @SequenceGenerator(
            name = "person_sequence",
            sequenceName = "person_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "person_sequence"
    )
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private Integer reportedIncome;
    private Integer taxBracketPercentage;
    private Integer totalTaxDue;
    private Boolean taxPaid;

    public Person() {
    }

    public Person(String firstName, String lastName, LocalDate dob, Integer reportedIncome, Integer taxBracketPercentage, Integer totalTaxDue, Boolean taxPaid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.reportedIncome = reportedIncome;
        this.taxBracketPercentage = taxBracketPercentage;
        this.totalTaxDue = totalTaxDue;
        this.taxPaid = taxPaid;
    }

    public Person(Long id, String firstName, String lastName, LocalDate dob, Integer reportedIncome, Integer taxBracketPercentage, Integer totalTaxDue, Boolean taxPaid) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.reportedIncome = reportedIncome;
        this.taxBracketPercentage = taxBracketPercentage;
        this.totalTaxDue = totalTaxDue;
        this.taxPaid = taxPaid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getReportedIncome() {
        return reportedIncome;
    }

    public void setReportedIncome(Integer reportedIncome) {
        this.reportedIncome = reportedIncome;
    }

    public Integer getTaxBracketPercentage() {
        return taxBracketPercentage;
    }

    public void setTaxBracketPercentage(Integer taxBracketPercentage) {
        this.taxBracketPercentage = taxBracketPercentage;
    }

    public Integer getTotalTaxDue() {
        return totalTaxDue;
    }

    public void setTotalTaxDue(Integer totalTaxDue) {
        this.totalTaxDue = totalTaxDue;
    }

    public Boolean getTaxPaid() {
        return taxPaid;
    }

    public void setTaxPaid(Boolean taxPaid) {
        this.taxPaid = taxPaid;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", reportedIncome=" + reportedIncome +
                ", taxBracketPercentage=" + taxBracketPercentage +
                ", totalTaxDue=" + totalTaxDue +
                ", taxPaid=" + taxPaid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(dob, person.dob) && Objects.equals(reportedIncome, person.reportedIncome) && Objects.equals(taxBracketPercentage, person.taxBracketPercentage) && Objects.equals(totalTaxDue, person.totalTaxDue) && Objects.equals(taxPaid, person.taxPaid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, dob, reportedIncome, taxBracketPercentage, totalTaxDue, taxPaid);
    }
}
